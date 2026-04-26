package prax.kniznica.rating;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    private final RatingServiceInterface ratingService;

    public RatingController(RatingServiceInterface ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/getAll")
    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }

    @PostMapping("/add")
    public void addRating(@RequestBody RatingRequest request) {
        Rating rating = new Rating(null, request.getUserId(), request.getFilmId(), request.getValue());
        ratingService.addRating(rating);
    }

    @PutMapping("/update/{id}")
    public void updateRating(@PathVariable Long id, @RequestBody RatingRequest request) {
        Rating rating = new Rating(null, request.getUserId(), request.getFilmId(), request.getValue());
        ratingService.updateRating(id, rating);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRating(@PathVariable Long id) {
        ratingService.removeRating(id);
    }
}