package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.CategoryType;

import java.time.LocalDateTime;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
public class ModelDTO {
    private String id;
    private String name;
    private String imageUrl;
    private CategoryType category;
    private Integer startYear;
    private Integer endYear;
    private LocalDateTime created;
    private LocalDateTime modified;
    private BrandDTO brand;
    private Set<OfferDTO> offers;
}
