package prax.kniznica.comments;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryCommentService implements CommentService {

    private final List<Comment> comments = new ArrayList<>();

    @Override
    public List<Comment> findAll() {
        return List.copyOf(comments);
    }

    @Override
    public Comment create(Comment comment) {
        if (comment.getTimestamp() == null) {
            comment.setTimestamp(Instant.now());
        }
        comments.add(comment);
        return comment;
    }
}
