package mobilelele.project.service.impl;

import mobilelele.project.domain.entities.dto.RoleDTO;
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
}
