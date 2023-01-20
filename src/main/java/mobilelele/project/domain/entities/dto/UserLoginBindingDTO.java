package mobilelele.project.domain.entities.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserLoginBindingDTO {
    @NotNull
    @Size(min = 2)
    private String username;
    @NotNull
    @Size(min = 3)
    private String password;
}
