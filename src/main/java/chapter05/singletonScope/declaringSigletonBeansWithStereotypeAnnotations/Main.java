package chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations;

import chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Infra.ProjectConfig15;
import chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Services.ServiceTest1;
import chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Services.ServiceTest2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig15.class);
        ServiceTest1 test1 = context.getBean(ServiceTest1.class);
        ServiceTest2 test2 = context.getBean(ServiceTest2.class);
        boolean b = test1.getTestRepository() == test2.getTestRepository();
        System.out.println(b);
    }
}
