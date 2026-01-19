package chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Services",
        "chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Repositories"})

public class ProjectConfig15 {
}
