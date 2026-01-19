package chapter05.testingTheLazyInstantiation.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter05.singletonScope.testingTheLazyInstantiation.Services")
public class ProjectConfig17 {
}
