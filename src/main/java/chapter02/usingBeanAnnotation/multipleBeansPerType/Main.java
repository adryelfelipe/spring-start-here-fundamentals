package chapter02.usingBeanAnnotation.multipleBeansPerType;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Infra.ProjectConfig2;

import chapter02.usingBeanAnnotation.multipleBeansPerType.Models.Parrot2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initializes and represents the Spring Context using this object
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        // Testing the Parrot Bean initialization by the name identifier
        Parrot2 parrotOneByBeanReference = context.getBean("parrot1", Parrot2.class);
        System.out.println(parrotOneByBeanReference.getName());

        // Testing the Parrot Bean initialization by the name identifier
        Parrot2 parrotTwoByBeanReference = context.getBean("parrot2", Parrot2.class);
        System.out.println(parrotTwoByBeanReference.getName());

        // Testing the Parrot Bean initialization by the name identifier
        Parrot2 parrotThreeByBeanReference = context.getBean("parrot3", Parrot2.class);
        System.out.println(parrotThreeByBeanReference.getName());
    }
}
