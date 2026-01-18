package chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation;

import chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Infra.ProjectConfig13;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig13.class);
    }
}
