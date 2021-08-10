package tatsumibruno.samples.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    public static UserDTO from(final User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }
}
