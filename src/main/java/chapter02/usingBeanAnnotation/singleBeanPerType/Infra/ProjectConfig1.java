package chapter02.usingBeanAnnotation.singleBeanPerType.Infra;

import chapter02.usingBeanAnnotation.singleBeanPerType.Model.Parrot1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1 {
    @Bean()
    Parrot1 parrot() {
        Parrot1 p = new Parrot1();
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
