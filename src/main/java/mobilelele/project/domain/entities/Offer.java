package mobilelele.project.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mobilelele.project.domain.entities.enums.EngineType;
import mobilelele.project.domain.entities.enums.TransmissionType;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "offers")
@Getter
@Setter
@NoArgsConstructor
public class Offer extends BaseEntity {
    @Column
    private String description;
    @Column
    @Enumerated(EnumType.STRING)
    private EngineType engine;
    @Column(name = "image_url")
    private String imageUrl;
    @Column
    private Double mileage;
    @Column
    private BigDecimal price;
    @Column
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission;
    @Column
    private Integer year;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;
    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    private User seller;
}
