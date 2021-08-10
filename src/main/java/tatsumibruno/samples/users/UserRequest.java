package tatsumibruno.samples.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRequest {
    @NotEmpty
    private String name;
    @NotEmpty
    private String email;

    public User toDomain() {
        return new User(name, email);
    }
}
