package tatsumibruno.samples.users;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    @Transactional
    public Long create(@RequestBody @Valid UserRequest newUser) {
        User user = newUser.toDomain();
        userRepository.save(user);
        return user.getId();
    }

    @GetMapping
    public List<UserDTO> list() {
        return userRepository.findByActiveTrue()
                .stream()
                .map(UserDTO::from)
                .collect(Collectors.toList());
    }

    @Transactional
    @DeleteMapping(path = "/{id}")
    public void disable(@PathVariable final Long id) {
        userRepository.findById(id)
                .ifPresent(User::disable);
    }
}
