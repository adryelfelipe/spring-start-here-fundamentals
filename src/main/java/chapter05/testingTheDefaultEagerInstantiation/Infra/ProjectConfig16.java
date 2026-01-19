package chapter05.testingTheDefaultEagerInstantiation.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter05.singletonScope.testingTheDefaultEagerInstantiation.Services")
public class ProjectConfig16 {
}
