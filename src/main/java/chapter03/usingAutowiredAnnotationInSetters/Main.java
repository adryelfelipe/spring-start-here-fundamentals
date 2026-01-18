package chapter03.usingAutowiredAnnotationInSetters;

import chapter03.usingAutowiredAnnotationInSetters.Infra.ProjectConfig10;
import chapter03.usingAutowiredAnnotationInSetters.Models.Parrot10;
import chapter03.usingAutowiredAnnotationInSetters.Models.Person5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig10.class);
        Person5 person = context.getBean(Person5.class);
        Parrot10 parrot = context.getBean(Parrot10.class);
        System.out.println(parrot);
        System.out.println(person);
        System.out.println(person.getParrot());
    }
}
