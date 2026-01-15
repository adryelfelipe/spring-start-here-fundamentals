package chapter02.usingBeanAnnotation.multipleBeansPerType;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Infra.ProjectConfig;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Testing the Parrot Bean initialization by the name identifier
        Parrot parrotOneByBeanReference = context.getBean("parrot1", Parrot.class);
        System.out.println(parrotOneByBeanReference.getName());

        // Testing the Parrot Bean initialization by the name identifier
        Parrot parrotTwoByBeanReference = context.getBean("parrot2", Parrot.class);
        System.out.println(parrotTwoByBeanReference.getName());

        // Testing the Parrot Bean initialization by the name identifier
        Parrot parrotThreeByBeanReference = context.getBean("parrot3", Parrot.class);
        System.out.println(parrotThreeByBeanReference.getName());
    }
}
