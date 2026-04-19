package prax.kniznica.film;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/film")
@RequiredArgsConstructor
public class FilmController {
    private final FilmService filmService;


    @GetMapping("/getAll")
    public ResponseEntity<List<Film>> getAllFilms() {
        return  null;
    }

    @GetMapping("/getTop")
    public ResponseEntity<List<Film>> getTopFilms() {
        return  null;
    }

    @PostMapping("/add")
    public Film addFilm(@RequestBody Film film) {
        return  null;
    }

    @PostMapping("/edit")
    public Film editFilm(@RequestBody Film film) {
        return  null;
    }

    @DeleteMapping("/remove")
    public Film removeFilm(@RequestBody Film film) {
        return  null;
    }

    @GetMapping("/detail")
    public Film getFilmDetail(@RequestParam int id) {
        return  null;
    }

}
