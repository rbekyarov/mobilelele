package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.UserRoleEnum;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RoleDTO {
    private String id;
    private UserRoleEnum role;
    private Set<UserDTO> users;
}
