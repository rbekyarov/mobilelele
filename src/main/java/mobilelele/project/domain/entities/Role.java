package mobilelele.project.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.UserRoleEnum;


import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class Role extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private UserRoleEnum role;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private Set<User> users;

    public Role(UserRoleEnum role) {
        this.role = role;
    }
}