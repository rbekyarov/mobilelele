package mobilelele.project.service.impl;

import mobilelele.project.domain.entities.User;
import mobilelele.project.domain.entities.dto.UserDTO;
import mobilelele.project.domain.entities.enums.UserRoleEnum;
import mobilelele.project.repository.UserRepository;
import mobilelele.project.service.RoleService;
import mobilelele.project.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, RoleService roleService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDTO register(UserDTO userDTO) {
        roleService.seedRolesInDb();
        if (userRepository.count() == 0) {
            userDTO.setRoles(roleService.findAllRoles());
        } else {
            userDTO.setRoles(new LinkedHashSet<>());
            userDTO.getRoles().add(roleService.findByAuthority(UserRoleEnum.ROLE_USER));
        }

        userDTO.setActive(true);
        userDTO.setCreated(LocalDateTime.now());
        userDTO.setModified(LocalDateTime.now());
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        User user = modelMapper.map(userDTO, User.class);

        return modelMapper.map(userRepository.saveAndFlush(user), UserDTO.class);
    }



}
