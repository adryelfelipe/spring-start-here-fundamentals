package chapter02.usingProgrammaticallyApproach;

import chapter02.usingProgrammaticallyApproach.Infra.ProjectConfig5;
import chapter02.usingProgrammaticallyApproach.Models.Parrot5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig5.class);
        Parrot5 parrot = new Parrot5();
        parrot.setName("AndersonBird");

        Supplier<Parrot5> parrotSupplier = () -> parrot;
        context.registerBean("anderson", Parrot5.class, parrotSupplier);
    }
}
