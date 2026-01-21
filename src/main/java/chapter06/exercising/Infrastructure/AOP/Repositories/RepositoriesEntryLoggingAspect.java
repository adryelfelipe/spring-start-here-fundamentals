package chapter06.exercising.Infrastructure.AOP.Repositories;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class RepositoriesEntryLoggingAspect {
    // Attributes
    private Logger logger = Logger.getLogger(RepositoriesEntryLoggingAspect.class.getName());

    // Methods
    @Before("execution(* chapter06.exercising.Repositories.BookRepository.*(..))")
    public void entryLog() {
        logger.info("Starting the repository method");
    }
}
