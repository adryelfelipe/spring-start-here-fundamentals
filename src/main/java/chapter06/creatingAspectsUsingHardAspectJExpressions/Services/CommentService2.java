package chapter06.creatingAspectsUsingHardAspectJExpressions.Services;

import chapter06.creatingAspectsUsingHardAspectJExpressions.Models.Comment2;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService2 {
    // Attributes
    private Logger logger = Logger.getLogger(CommentService2.class.getName());

    // Methods
    public String publishComment(Comment2 comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCESS";
    }
}
