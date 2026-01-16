package chapter02.usingStereotypeAnnotations.componentAnnotation;

import chapter02.usingStereotypeAnnotations.componentAnnotation.Infra.ProjectConfig3;
import chapter02.usingStereotypeAnnotations.componentAnnotation.Models.Parrot3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        // Testing the Parrot Bean initialization
        Parrot3 parrot3ByBeanReference = context.getBean(Parrot3.class);
        System.out.println(parrot3ByBeanReference.getName());
    }
}
