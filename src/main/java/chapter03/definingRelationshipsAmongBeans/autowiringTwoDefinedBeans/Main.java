package chapter03.definingRelationshipsAmongBeans.autowiringTwoDefinedBeans;

import chapter03.definingRelationshipsAmongBeans.autowiringTwoDefinedBeans.Infra.ProjectConfig7;
import chapter03.definingRelationshipsAmongBeans.autowiringTwoDefinedBeans.Models.Parrot7;
import chapter03.definingRelationshipsAmongBeans.autowiringTwoDefinedBeans.Models.Person2;
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
