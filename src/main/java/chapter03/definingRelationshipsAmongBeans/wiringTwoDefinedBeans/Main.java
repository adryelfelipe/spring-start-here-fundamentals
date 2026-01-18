package chapter03.definingRelationshipsAmongBeans.wiringTwoDefinedBeans;

import chapter03.definingRelationshipsAmongBeans.wiringTwoDefinedBeans.Infra.ProjectConfig6;
import chapter03.definingRelationshipsAmongBeans.wiringTwoDefinedBeans.Models.Parrot6;
import chapter03.definingRelationshipsAmongBeans.wiringTwoDefinedBeans.Models.Person1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig6.class);
        Person1 person = context.getBean(Person1.class);
        Parrot6 parrot = context.getBean(Parrot6.class);
        System.out.println(parrot);
        System.out.println(person);
        System.out.println(person.getParrot());
    }
}
