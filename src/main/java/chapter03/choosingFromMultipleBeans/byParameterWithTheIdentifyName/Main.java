package chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName;

import chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Infra.ProjectConfig11;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig11.class);
    }
}
