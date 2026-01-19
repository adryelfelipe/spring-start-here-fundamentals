package chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations;

import chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Infra.ProjectConfig19;
import chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Services.PrototypeService1;
import chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Services.PrototypeService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig19.class);
        PrototypeService1 service1 = context.getBean(PrototypeService1.class);
        PrototypeService2 service2 = context.getBean(PrototypeService2.class);
        boolean testintingPrototype = service2.getRepository() == service1.getRepository();
        System.out.println(testintingPrototype);
    }
}
