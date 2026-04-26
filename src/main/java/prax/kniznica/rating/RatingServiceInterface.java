package prax.kniznica.rating;

import java.util.List;

public interface RatingServiceInterface {
    List<Rating> getAllRatings();
    void addRating(Rating rating);
    void updateRating(Long id, Rating rating);
    void removeRating(Long id);
}