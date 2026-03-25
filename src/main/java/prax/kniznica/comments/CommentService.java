package prax.kniznica.comments;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    private final List<Comment> comments = new ArrayList<>();

    public List<Comment> findAll() {
        return List.copyOf(comments);
    }

    public Comment create(Comment comment) {
        if (comment.getTimestamp() == null) {
            comment.setTimestamp(Instant.now());
        }
        comments.add(comment);
        return comment;
    }
}
