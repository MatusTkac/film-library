package prax.kniznica.rating;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RatingService implements RatingServiceInterface {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public void addRating(Rating rating) {
        ratingRepository.save(rating);
    }

    @Override
    public void updateRating(Long id, Rating rating) {
        rating.setId(id);
        ratingRepository.save(rating);
    }

    @Override
    public void removeRating(Long id) {
        ratingRepository.deleteById(id);
    }
}