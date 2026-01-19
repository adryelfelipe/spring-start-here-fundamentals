package chapter05.testingTheDefaultEagerInstantiation;

import chapter05.testingTheDefaultEagerInstantiation.Infra.ProjectConfig16;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig16.class);
    }
}
