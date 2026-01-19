package chapter05.testingTheLazyInstantiation;

import chapter05.testingTheLazyInstantiation.Infra.ProjectConfig17;
import chapter05.testingTheLazyInstantiation.Services.TestService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig17.class);
        System.out.println("Before the bean initialization");
        try{
            Thread.sleep(4000);
        } catch (Exception e) {
        }

        // Refering to the bean will make Spring initialize the object
        TestService2 reference = context.getBean(TestService2.class);
    }
}
