package chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("chapter06.creatingAspectsUsingAspectJAnnotationExpressions.Services")
public class ProjectConfig21 {
    @Bean
    LoggingAspect2 loggingAspect2() {
        return new LoggingAspect2();
    }
}
