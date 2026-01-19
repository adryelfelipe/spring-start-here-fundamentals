package chapter04;

import chapter04.infrastructure.ProjectConfiguration;
import chapter04.models.Comment;
import chapter04.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService commentService = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Laurenthiu");
        comment.setText("Demo content");
        commentService.publishComment(comment);
    }
}
