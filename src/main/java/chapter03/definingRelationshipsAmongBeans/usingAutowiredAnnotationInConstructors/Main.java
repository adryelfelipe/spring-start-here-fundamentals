package chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors;

import chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors.Infra.ProjectConfig9;
import chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors.Models.Parrot9;
import chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors.Models.Person4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig9.class);
        Person4 person = context.getBean(Person4.class);
        Parrot9 parrot = context.getBean(Parrot9.class);
        System.out.println(parrot);
        System.out.println(person);
        System.out.println(person.getParrot());
    }
}
