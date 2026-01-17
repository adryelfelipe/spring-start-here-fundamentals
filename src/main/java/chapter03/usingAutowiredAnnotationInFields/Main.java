package chapter03.usingAutowiredAnnotationInFields;

import chapter03.usingAutowiredAnnotationInFields.Infra.ProjectConfig8;
import chapter03.usingAutowiredAnnotationInFields.Models.Parrot8;
import chapter03.usingAutowiredAnnotationInFields.Models.Person3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig8.class);
        Person3 person = context.getBean(Person3.class);
        Parrot8 parrot = context.getBean(Parrot8.class);
        System.out.println(parrot);
        System.out.println(person);
        System.out.println(person.getParrot());
    }
}
