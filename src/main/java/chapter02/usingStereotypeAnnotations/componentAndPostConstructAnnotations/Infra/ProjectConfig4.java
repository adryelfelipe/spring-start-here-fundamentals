package chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations.Models")
public class ProjectConfig4 {
}
