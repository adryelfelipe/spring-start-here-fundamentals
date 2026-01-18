package chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter03.usingAutowiredAnnotationInConstructors.Models")
public class ProjectConfig9 {
}
