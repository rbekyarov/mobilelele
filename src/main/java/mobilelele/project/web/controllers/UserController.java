package mobilelele.project.web.controllers;

import mobilelele.project.domain.entities.dto.UserDTO;
import mobilelele.project.service.RoleService;
import mobilelele.project.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController{

    private final RoleService roleService;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(RoleService roleService, UserService userService, ModelMapper modelMapper) {
        this.roleService = roleService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/register")
    public ModelAndView register(ModelAndView modelAndView) {
        modelAndView.addObject("roles", roleService.getAllRoles());
        return super.view("auth-register", modelAndView);
    }

    @PostMapping("/register")
    public ModelAndView registerConfirm(@ModelAttribute(name = "model") UserRegisterBindinDTO model) {
        this.userService.register(modelMapper.map(model, UserDTO.class));
        return super.redirect("/");
    }
}
