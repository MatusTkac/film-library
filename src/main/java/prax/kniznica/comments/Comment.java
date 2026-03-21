package prax.kniznica.comments;

import java.time.Instant;

public class Comment {

    private Long userId;
    private Long filmId;
    private Instant timestamp;
    private String komentar;
    private Integer hodnotenie;

    public Comment() {
    }

    public Comment(Long userId, Long filmId, Instant timestamp, String komentar, Integer hodnotenie) {
        this.userId = userId;
        this.filmId = filmId;
        this.timestamp = timestamp;
        this.komentar = komentar;
        this.hodnotenie = hodnotenie;
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

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public Integer getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(Integer hodnotenie) {
        this.hodnotenie = hodnotenie;
    }
}
