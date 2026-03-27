package prax.kniznica.rating;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    private final RatingServiceInterface ratingService;

    public RatingController(RatingServiceInterface ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/getAll")
    public List<Rating> getAllRatings() {
        return null;
    }

    @PostMapping("/add")
    public Rating addRating(
        @RequestBody Rating rating) {
        return null;
    }

    @PutMapping("/update/{id}")
    public Rating updateRating(
        @PathVariable Long id,
        @RequestBody Rating rating) {

        return null;
    }

    @DeleteMapping("/delete/{id}")
    public Void deleteRating(
        @PathVariable Long id) {

        return null;
    }
}
