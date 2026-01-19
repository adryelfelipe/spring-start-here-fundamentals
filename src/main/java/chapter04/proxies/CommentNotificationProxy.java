package chapter04.proxies;

import chapter04.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
