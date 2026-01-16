package chapter02.usingBeanAnnotation.singleBeanPerType;

import chapter02.usingBeanAnnotation.singleBeanPerType.Infra.ProjectConfig1;
import chapter02.usingBeanAnnotation.singleBeanPerType.Model.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig1.class);

        // Testing the Parrot Bean initialization
        Parrot1 parrotByBeanReference = context.getBean(Parrot1.class);
        System.out.println(parrotByBeanReference.getName());

        // Testing the String Bean (Hello World) initialization
        String stringByBeanReference = context.getBean(String.class);
        System.out.println(stringByBeanReference);

        // Testing the Integer Bean (10) initialization
        Integer integerByBeanReference = context.getBean(Integer.class);
        System.out.println(integerByBeanReference);
    }
}
