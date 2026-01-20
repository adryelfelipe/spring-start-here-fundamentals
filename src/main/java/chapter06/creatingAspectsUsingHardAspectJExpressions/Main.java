package chapter06.creatingAspectsUsingHardAspectJExpressions;

import chapter06.creatingAspectsUsingHardAspectJExpressions.Infra.ProjectConfig20;
import chapter06.creatingAspectsUsingHardAspectJExpressions.Models.Comment2;
import chapter06.creatingAspectsUsingHardAspectJExpressions.Services.CommentService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig20.class);
        CommentService2 service = context.getBean(CommentService2.class);
        Comment2 comment = new Comment2();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        service.publishComment(comment);
    }
}
