package chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation;

import chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Infra.ProjectConfig12;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig12.class);
    }
}
