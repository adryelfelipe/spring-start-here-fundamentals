package chapter02.usingStereotypeAnnotations.componentAnnotation;

import chapter02.usingStereotypeAnnotations.componentAnnotation.Infra.ProjectConfig;
import chapter02.usingStereotypeAnnotations.componentAnnotation.Models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Testing the Parrot Bean initialization
        Parrot parrotByBeanReference = context.getBean(Parrot.class);
        System.out.println(parrotByBeanReference.getName());
    }
}
