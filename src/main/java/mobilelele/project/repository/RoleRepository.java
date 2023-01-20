package mobilelele.project.repository;

import mobilelele.project.domain.entities.Role;
import mobilelele.project.domain.entities.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    Role findByRole(UserRoleEnum roleEnum);
}
