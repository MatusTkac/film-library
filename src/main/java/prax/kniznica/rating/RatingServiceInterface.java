package prax.kniznica.rating;

public interface RatingServiceInterface {

    void addRating(Rating rating);

    void updateRating(Long id, Rating rating);

    void removeRating(Long id);
}
