package chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Repositories",
                            "chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Services"})

public class ProjectConfig19 {
}
