package chapter06.exercising.Infrastructure.AOP.Services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class ServiceLogAspect1 {
    private Logger logger = Logger.getLogger(ServiceLogAspect1.class.getName());

    @Around("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log1(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Execution chain 1");
        joinPoint.proceed();
    }

    @Before("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log2() {
        logger.info("Execution chain 2");
    }

    @After("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log3() {
        logger.info("Execution chain 6");
    }

    @AfterReturning("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log4() {
        logger.info("Execution chain 7");
    }

    @AfterThrowing("@annotation(chapter06.exercising.Application.Annotations.ToServiceLog)")
    public void log5() {
        logger.info("Execution chain 8");
    }
}
