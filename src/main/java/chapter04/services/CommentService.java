package chapter04.services;

import chapter04.models.Comment;
import chapter04.proxies.CommentNotificationProxy;
import chapter04.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    // Attributes

    // @Autowire, this approach would also function for DI
    private final CommentNotificationProxy commentNotificationProxy;
    // @Autowire, this approach would also function for DI
    private final CommentRepository commentRepository;

    // Constructor
    // @Autowire, there is just one constructor, so this annotation can be implicit
    public CommentService(@Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    // Methods
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
