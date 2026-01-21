package chapter06.exercising.Infrastructure.Configuration;

import chapter06.exercising.Repositories.BookRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"chapter06.exercising.Services", "chapter06.exercising.Infrastructure.AOP"})
@EnableAspectJAutoProxy
public class ProjectConfig22 {
    @Bean
    BookRepositoryImpl bookRepositoryImpl() {
        return new BookRepositoryImpl();
    }
}
