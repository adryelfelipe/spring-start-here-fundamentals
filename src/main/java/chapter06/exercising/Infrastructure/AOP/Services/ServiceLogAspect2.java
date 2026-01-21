package chapter06.exercising.Infrastructure.AOP.Services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class ServiceLogAspect2 {
    private Logger logger = Logger.getLogger(ServiceLogAspect2.class.getName());

    @Around("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Execution chain 3");
        joinPoint.proceed();
        logger.info("Execution chain 4");
    }

    @After("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log2() {
        logger.info("Execution chain 5");
    }
}
