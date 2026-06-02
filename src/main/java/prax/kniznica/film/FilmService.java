package prax.kniznica.film;

import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService implements FilmServiceInterface {

    private final DataSource dataSource;

    public FilmService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Film> getFilmList() {
        List<Film> result = new ArrayList<>();
        String sql = "SELECT id, name, author, genre FROM films ORDER BY id";
        try (Connection c = dataSource.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Film f = new Film();
                    f.setId(rs.getInt("id"));
                    f.setName(rs.getString("name"));
                    f.setAuthor(rs.getString("author"));
                    f.setGenre(rs.getString("genre"));
                    result.add(f);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public Film addFilm(Film film) {
        String sql = "INSERT INTO films(name, author, genre) VALUES (?, ?, ?)";
        try (Connection c = dataSource.getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, film.getName());
            ps.setString(2, film.getAuthor());
            ps.setString(3, film.getGenre());
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    film.setId(keys.getInt(1));
                }
            }
            return film;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Film editFilm(int id, Film film) {
        String sql = "UPDATE films SET name = ?, author = ?, genre = ? WHERE id = ?";
        try (Connection c = dataSource.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, film.getName());
            ps.setString(2, film.getAuthor());
            ps.setString(3, film.getGenre());
            ps.setInt(4, id);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                film.setId(id);
                return film;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Film removeFilm(int id) {
        String sql = "DELETE FROM films WHERE id = ?";
        try (Connection c = dataSource.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            if (deleted > 0) {
                Film f = new Film();
                f.setId(id);
                return f;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
