package mobilelele.project.service;

import mobilelele.project.domain.entities.dto.RoleDTO;
import mobilelele.project.domain.entities.enums.UserRoleEnum;

import java.util.Set;

public interface RoleService {
    Set<RoleDTO> getAllRoles();

    void seedRolesInDb();

    Set<RoleDTO> findAllRoles();
    RoleDTO findByAuthority(UserRoleEnum role);
}
