package prax.kniznica.rating;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingRequest {
    private Long userId;
    private Long filmId;
    private Integer value;
}