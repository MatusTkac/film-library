package prax.kniznica.rating;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RatingService implements RatingServiceInterface {

    private final List<Rating> ratings = new ArrayList<>();

    @Override
    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    @Override
    public void updateRating(Long id, Rating rating) {
    }

    @Override
    public void removeRating(Long id) {
    }
}
