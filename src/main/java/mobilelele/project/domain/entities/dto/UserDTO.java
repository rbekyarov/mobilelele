package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean active;
    private Set<RoleDTO> roles;
    private String imageUrl;
    private LocalDateTime created;
    private LocalDateTime modified;
    private Set<OfferDTO> offers;
}
