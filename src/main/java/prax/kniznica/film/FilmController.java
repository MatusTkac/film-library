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
        return ResponseEntity.ok(filmService.getFilmList());
    }

    @PostMapping("/add")
    public Film addFilm(@RequestBody Film film) {
        return filmService.addFilm(film);
    }

    @PostMapping("/edit")
    public Film editFilm(@RequestBody Film film) {
        return filmService.editFilm(film.getId(), film);
    }

    @DeleteMapping("/remove/{id}")
    public Film removeFilm(@PathVariable int id) {
        return filmService.removeFilm(id);
    }

    

}
