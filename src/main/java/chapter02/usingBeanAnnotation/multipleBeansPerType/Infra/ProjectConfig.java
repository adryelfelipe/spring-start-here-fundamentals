package chapter02.usingBeanAnnotation.multipleBeansPerType.Infra;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Models.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "parrot1")
    // @Primary makes this bean the first option in a multiple beans case
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Jezinha");
        return p;
    }

    @Bean(value = "parrot2")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Gritinho");
        return p;
    }

    @Bean("parrot3")
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Bolachinha");
        return p;
    }
}
