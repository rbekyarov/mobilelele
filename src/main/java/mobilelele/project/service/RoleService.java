package mobilelele.project.service;

import mobilelele.project.domain.entities.dto.RoleDTO;

import java.util.Set;

public interface RoleService {
    Set<RoleDTO> getAllRoles();
}
