package chapter04.repositories;

import chapter04.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
