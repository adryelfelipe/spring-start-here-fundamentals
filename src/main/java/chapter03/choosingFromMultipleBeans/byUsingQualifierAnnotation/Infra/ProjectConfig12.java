package chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Infra;

import chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models.Parrot12;
import chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models.Person7;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models")
public class ProjectConfig12 {
    @Bean(name = "jezinha")
    Parrot12 parrot1() {
       return new Parrot12();
    }

    @Bean(value = "gritinho")
    Parrot12 parrot2() {
        return new Parrot12();
    }

    @Bean("max")
    Parrot12 parrot3() {
        return new Parrot12();
    }

    @Bean
    Parrot12 parrot4() {
        return new Parrot12();
    }

    @Bean
    Person7 person(@Qualifier("max") Parrot12 parrot) {
        return new Person7(parrot);
    }
}
