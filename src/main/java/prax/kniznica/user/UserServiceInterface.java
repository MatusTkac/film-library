package prax.kniznica.user;

public interface UserServiceInterface {

    void watchFilm(Long userId, Long filmId);

    void addComment(Long userId, Long filmId, String comment);

    void addRating(Long userId, Long filmId, Integer value);
}
