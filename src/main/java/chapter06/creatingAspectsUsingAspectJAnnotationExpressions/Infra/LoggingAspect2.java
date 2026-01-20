package chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Infra;

import chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Services.CommentService3;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect2 {
    private Logger logger = Logger.getLogger(CommentService3.class.getName());

    @Around("@annotation(ToLog)")
    public void log9(ProceedingJoinPoint jointPoint) throws Throwable {
        logger.info("The method gonna start now");
        jointPoint.proceed();
        logger.info("The method is concluded");
    }
}
