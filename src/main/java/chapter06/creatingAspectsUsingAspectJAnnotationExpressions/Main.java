package chapter06.creatingAspectsUsingAspectJAnnotationExpressions;

import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Infra.ProjectConfig21;
import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Models.Comment3;
import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Services.CommentService3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig21.class);
        CommentService3 service = context.getBean(CommentService3.class);
        Comment3 comment = new Comment3();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        service.deleteComment(comment);
    }
}
