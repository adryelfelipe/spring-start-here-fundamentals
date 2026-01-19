package chapter05.singletonScope.declaringSingletonBeansWithBeanAnnotation;

import chapter05.singletonScope.declaringSingletonBeansWithBeanAnnotation.Infra.ProjectConfig14;
import chapter05.singletonScope.declaringSingletonBeansWithBeanAnnotation.Services.ServiceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig14.class);
        ServiceTest test1 = context.getBean("serviceTest", ServiceTest.class);
        ServiceTest test2 = context.getBean("serviceTest", ServiceTest.class);
        ServiceTest test3 = context.getBean("serviceTest", ServiceTest.class);
        boolean b1 = test1 == test2 && test2 == test3;
        System.out.println(b1);
    }
}
