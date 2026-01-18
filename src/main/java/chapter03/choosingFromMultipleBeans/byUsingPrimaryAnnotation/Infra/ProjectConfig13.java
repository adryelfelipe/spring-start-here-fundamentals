package chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Infra;

import chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Models.Parrot13;
import chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Models.Person8;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Models")
public class ProjectConfig13 {
    @Primary
    @Bean(name = "jezinha")
    Parrot13 parrot1() {
       return new Parrot13();
    }

    @Bean(value = "grtitinho")
    Parrot13 parrot2() {
        return new Parrot13();
    }

    @Bean("max")
    Parrot13 parrot3() {
        return new Parrot13();
    }

    @Bean
    Parrot13 parrot4() {
        return new Parrot13();
    }

    @Bean
    Person8 person(Parrot13 parrot) {
        return new Person8(parrot);
    }
}
