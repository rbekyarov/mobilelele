package mobilelele.project.service;

import mobilelele.project.domain.entities.dto.RoleDTO;
import mobilelele.project.domain.entities.dto.UserDTO;
import mobilelele.project.domain.entities.enums.UserRoleEnum;

public interface UserService {
    UserDTO register(UserDTO userDTO);

}
