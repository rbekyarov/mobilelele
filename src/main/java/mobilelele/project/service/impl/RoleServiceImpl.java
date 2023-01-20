package mobilelele.project.service.impl;

import mobilelele.project.domain.entities.Role;
import mobilelele.project.domain.entities.dto.RoleDTO;
import mobilelele.project.domain.entities.enums.UserRoleEnum;
import mobilelele.project.repository.RoleRepository;
import mobilelele.project.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    public RoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Set<RoleDTO> getAllRoles() {
        return roleRepository.findAll()
                .stream().map(r -> modelMapper.map(r, RoleDTO.class))
                .collect(Collectors.toSet());
    }


        @Override
        public void seedRolesInDb() {
            if (this.roleRepository.count() == 0){
                this.roleRepository.saveAndFlush(new Role(UserRoleEnum.ROLE_ADMIN));
                this.roleRepository.saveAndFlush(new Role(UserRoleEnum.ROLE_USER));
            }
        }

    @Override
    public Set<RoleDTO> findAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(r -> modelMapper.map(r, RoleDTO.class))
                .collect(Collectors.toSet());
    }

    @Override
    public RoleDTO findByAuthority(UserRoleEnum role) {
        return modelMapper.map(roleRepository.findByRole(role), RoleDTO.class);
    }
}

