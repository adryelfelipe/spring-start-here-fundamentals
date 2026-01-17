package chapter03.wiringTwoDefinedBeans.Infra;

import chapter03.wiringTwoDefinedBeans.Models.Parrot6;
import chapter03.wiringTwoDefinedBeans.Models.Person1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig6 {
    @Bean
    Parrot6 parrot() {
        return new Parrot6();
    }

    @Bean
    Person1 person() {
        Person1 person = new Person1();
        person.setParrot(parrot());
        return person;
    }
}
