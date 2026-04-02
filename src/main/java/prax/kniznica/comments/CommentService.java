package prax.kniznica.comments;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    Comment create(Comment comment);
}
