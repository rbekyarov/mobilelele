package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class BrandDTO {
    private String id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;
    private Set<ModelDTO> models;
}
