package chapter02.usingBeanAnnotation.multipleBeansPerType.Infra;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Models.Parrot2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {
    @Bean(name = "parrot1")
    // @Primary makes this bean the first option in a multiple beans case
    Parrot2 parrot1() {
        Parrot2 p = new Parrot2();
        p.setName("Jezinha");
        return p;
    }

    @Bean(value = "parrot2")
    Parrot2 parrot2() {
        Parrot2 p = new Parrot2();
        p.setName("Gritinho");
        return p;
    }

    @Bean("parrot3")
    Parrot2 parrot3() {
        Parrot2 p = new Parrot2();
        p.setName("Bolachinha");
        return p;
    }
}
