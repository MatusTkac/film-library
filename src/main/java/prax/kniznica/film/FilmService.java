package prax.kniznica.film;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements FilmServiceInterface {
    @Override
    public List<Film> getFilmList() {
        return List.of();
    }

    @Override
    public Film addFilm(Film film) {
        /* add new film into the database
        database.add(film)
         */
        return film;
    }

    @Override
    public Film editFilm(int id, Film film) {
        /*
        edit film something like edit author name or genre
         */
        return null;
    }

    @Override
    public Film removeFilm(int id) {
        /*
        remove film from database by id
        database.remove(film)
         */
        return null;
    }

    @Override
    public List<Film> getTopFilm() {
        /*
        get top 10 most watched films
         */
        return List.of();
    }

    @Override
    public Film detailFilmById(int id) {
        /*
        get details from database about this exact film by id something like storyline and some actors and so on just text
         */
        return null;
    }
}
