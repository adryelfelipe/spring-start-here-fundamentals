package chapter06.exercising.Infrastructure.AOP.Repositories;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class RepositoriesExitLoggingAspect {
    // Attributes
    private Logger logger = Logger.getLogger(RepositoriesEntryLoggingAspect.class.getName());

    // Methods
    @Around("execution(* chapter06.exercising.Repositories.BookRepository.*(..))")
    public void exitLog1() {
        logger.info("Finishing the repository method 1");
    }

    @After("execution(* chapter06.exercising.Repositories.BookRepositoryImpl.*(..))")
    public void exitLog2() {
        logger.info("Finishing the repository method 2");
    }
}
