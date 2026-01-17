package chapter03.autowiringTwoDefinedBeans;

import chapter03.autowiringTwoDefinedBeans.Infra.ProjectConfig7;
import chapter03.autowiringTwoDefinedBeans.Models.Parrot7;
import chapter03.autowiringTwoDefinedBeans.Models.Person2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig7.class);
        Person2 person = context.getBean(Person2.class);
        Parrot7 parrot = context.getBean(Parrot7.class);
        System.out.println(parrot);
        System.out.println(person);
        System.out.println(person.getParrot());
    }
}
