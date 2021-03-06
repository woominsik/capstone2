package UJMProject.UJMProjectback.project.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @Column(name="user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String loginId;

    @Column(nullable = false)
    private String gender;

    @Builder

    public User(Long id, String name, String loginId, String gender) {
        this.id = id;
        this.name = name;
        this.loginId = loginId;
        this.gender = gender;
    }
}
