package mobilelele.project.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "brands")
@Getter
@Setter
@NoArgsConstructor
public class Brand extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;
    @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
    private Set<Model> models;
}