package prax.kniznica.history;

import java.time.Instant;

public class History {

    private Long userId;
    private Long filmId;
    private Instant timestamp;

    public History() {
    }

    public History(Long userId, Long filmId, Instant timestamp) {
        this.userId = userId;
        this.filmId = filmId;
        this.timestamp = timestamp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
