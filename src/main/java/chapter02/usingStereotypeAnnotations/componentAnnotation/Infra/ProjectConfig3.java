package chapter02.usingStereotypeAnnotations.componentAnnotation.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter02.usingStereotypeAnnotations.componentAnnotation.Models")
public class ProjectConfig3 {
}
