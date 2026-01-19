package chapter05.prototypeScope.declaringPrototypeBeansWithBeanAnnotation;

import chapter05.prototypeScope.declaringPrototypeBeansWithBeanAnnotation.Infra.ProjectConfig18;
import chapter05.prototypeScope.declaringPrototypeBeansWithBeanAnnotation.Services.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig18.class);
        Service s1 = context.getBean("generator", Service.class);
        Service s2 = context.getBean("generator", Service.class);
        boolean testingPrototype = s1 == s2;
        System.out.println(testingPrototype);
    }
}
