package chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations;

import chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations.Infra.ProjectConfig4;
import chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations.Models.Parrot4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig4.class);

        // Testing the Parrot Bean initialization and the PostConstruct annotation
        Parrot4 parrot4 = context.getBean(Parrot4.class);
        System.out.println(parrot4.getName());
    }
}
