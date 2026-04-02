package prax.kniznica.history;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {
    private Long userId;
    private Long filmId;
    private Instant timestamp;
}
