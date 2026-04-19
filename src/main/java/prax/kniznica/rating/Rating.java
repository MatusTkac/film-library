package prax.kniznica.rating;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {

    private Long id;
    private Long userId;
    private Long filmId;
    private Integer value;

    public Rating() {
    }

    public Rating(Long id, Long userId, Long filmId, Integer value) {
        this.id = id;
        this.userId = userId;
        this.filmId = filmId;
        this.value = value;
    }
}
