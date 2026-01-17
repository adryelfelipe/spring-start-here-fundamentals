package chapter03.autowiringTwoDefinedBeans.Infra;

import chapter03.autowiringTwoDefinedBeans.Models.Parrot7;
import chapter03.autowiringTwoDefinedBeans.Models.Person2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig7 {
    @Bean
    Parrot7 parrot() {
        return new Parrot7();
    }

    @Bean
    Person2 person(Parrot7 parrot) {
        Person2 person = new Person2();
        person.setParrot(parrot);
        return person;
    }
}
