package chapter03.usingAutowiredAnnotationInFields.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter03.usingAutowiredAnnotationInFields.Models")
public class ProjectConfig8 {
}
