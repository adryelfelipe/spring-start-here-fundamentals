package chapter06.creatingAspectsUsingHardAspectJExpressions.Infra;

import chapter06.creatingAspectsUsingHardAspectJExpressions.Models.Comment2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect1 {
    private Logger logger = Logger.getLogger(LoggingAspect1.class.getName());

    @Around("execution(* chapter06.creatingAspectsUsingAspectJ.Services.*.*(..))")
    public Object log(ProceedingJoinPoint jointPoint) throws Throwable{
        logger.info("Method will execute");
        String methodName = jointPoint.getSignature().getName();
        Object [] args = jointPoint.getArgs();
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(args) +
                " will execute");

        Comment2 a = new Comment2();
        Object[] c = {a};
        Object objetReturnedByMethod = jointPoint.proceed(c);
        logger.info("Method executed and returned: " + objetReturnedByMethod);
        return "FAILED";
    }
}
