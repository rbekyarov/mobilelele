package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UseRegisterBindingDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
}
