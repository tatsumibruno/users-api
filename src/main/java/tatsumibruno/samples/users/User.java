package tatsumibruno.samples.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private boolean active = true;

    public User(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }

    public void disable() {
        this.active = false;
    }
}
