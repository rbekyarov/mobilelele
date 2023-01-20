package mobilelele.project.domain.entities.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.EngineType;
import mobilelele.project.domain.entities.enums.TransmissionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class OfferDTO {
    private String id;
    private String description;
    private EngineType engine;
    private String imageUrl;
    private Double mileage;
    private BigDecimal price;
    private TransmissionType transmission;
    private Integer year;
    private LocalDateTime created;
    private LocalDateTime modified;
    private ModelDTO model;
    private UserDTO seller;
}
