package tatsumibruno.samples.users;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends org.springframework.data.repository.Repository<User, Long> {

    void save(final User user);

    List<User> findByActiveTrue();

    Optional<User> findById(final Long id);
}
