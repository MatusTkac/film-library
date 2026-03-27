package prax.kniznica.film;

import prax.kniznica.film.Film;

import java.util.List;

public interface FilmServiceInterface {

    List<Film> getFilmList();
    Film addFilm(Film film);
    Film editFilm(int id, Film film);
    Film removeFilm(int id);
    List<Film> getTopFilm();
    Film detailFilmById(int id);

}
