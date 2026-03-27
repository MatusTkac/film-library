package prax.kniznica.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

    private final List<User> users = new ArrayList<>();

    @Override
    public void watchFilm(Long userId, Long filmId) {
    }

    @Override
    public void addComment(Long userId, Long filmId, String comment) {
    }

    @Override
    public void addRating(Long userId, Long filmId, Integer value) {
    }
}
