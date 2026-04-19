package prax.kniznica.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceInterface userService;

    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @PostMapping("/watchFilm/{userId}/{filmId}")
    public User watchFilm(@PathVariable Long userId, @PathVariable Long filmId) {
        return null;
    }

    @PostMapping("/comment/{userId}/{filmId}/{comment}")
    public User addComment(
            @PathVariable Long userId,
            @PathVariable Long filmId,
            @PathVariable String comment
    ) {
        return null;
    }

    @PostMapping("/rating/{userId}/{filmId}/{value}")
    public User addRating(
            @PathVariable Long userId,
            @PathVariable Long filmId,
            @PathVariable Integer value
    ) {
        return null;
    }
}
