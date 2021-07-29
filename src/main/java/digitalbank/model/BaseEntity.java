package digitalbank.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BaseEntity {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
