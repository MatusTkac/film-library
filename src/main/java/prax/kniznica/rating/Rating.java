package prax.kniznica.rating;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "rating_value")
    private Integer value;

    public Rating() {}

    public Rating(Long id, Long userId, Long filmId, Integer value) {
        this.id = id;
        this.userId = userId;
        this.filmId = filmId;
        this.value = value;
    }
}