package mobilelele.project.domain.entities.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.EngineType;
import mobilelele.project.domain.entities.enums.TransmissionType;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class OfferBindingDTO {
    @NotNull
    private EngineType engine;
    @NotNull
    private String imageUrl;
    @NotNull
    @Positive
    private Integer mileage;
    @DecimalMin("100")
    private BigDecimal price;
    @Positive
    private Integer year;
    @NotEmpty
    @Size(min = 10, max = 512)
    private String description;
    @NotNull
    private TransmissionType transmission;
    @NotNull
    private String modelId;
}
