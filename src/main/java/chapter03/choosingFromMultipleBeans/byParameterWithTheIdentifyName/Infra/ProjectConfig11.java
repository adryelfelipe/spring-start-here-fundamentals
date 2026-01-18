package chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Infra;

import chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Models.Parrot11;
import chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Models.Person6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Models")
public class ProjectConfig11 {
    @Bean(name = "jezinha")
    Parrot11 parrot1() {
       return new Parrot11();
    }

    @Bean(value = "grtitinho")
    Parrot11 parrot2() {
        return new Parrot11();
    }

    @Bean("max")
    Parrot11 parrot3() {
        return new Parrot11();
    }

    @Bean
    Parrot11 parrot4() {
        return new Parrot11();
    }

    @Bean
    Person6 person(Parrot11 parrot4) {
        return new Person6(parrot4);
    }
}
