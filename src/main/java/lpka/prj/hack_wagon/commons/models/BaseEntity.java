package lpka.prj.hack_wagon.commons.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public abstract class BaseEntity {
    protected String id;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
}
