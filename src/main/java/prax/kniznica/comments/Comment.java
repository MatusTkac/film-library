package prax.kniznica.comments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Long userId;
    private Long filmId;
    private Instant timestamp;
    private String commentText;
    private Integer rating;
}
