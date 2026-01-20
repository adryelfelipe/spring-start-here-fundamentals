package chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Services;

import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Infra.ToLog;
import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Models.Comment3;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService3 {
    private Logger logger = Logger.getLogger(CommentService3.class.getName());
    public void publishComment(Comment3 comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment3 comment) {
        logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment3 comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
