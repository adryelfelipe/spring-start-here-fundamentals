package chapter02.usingBeanAnnotation.singleBeanPerType.Infra;

import chapter02.usingBeanAnnotation.singleBeanPerType.Model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean()
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("JetosValda");
        return p;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
