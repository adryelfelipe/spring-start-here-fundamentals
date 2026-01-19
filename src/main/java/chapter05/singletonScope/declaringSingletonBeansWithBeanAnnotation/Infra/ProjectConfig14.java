package chapter05.singletonScope.declaringSingletonBeansWithBeanAnnotation.Infra;

import chapter05.singletonScope.declaringSingletonBeansWithBeanAnnotation.Services.ServiceTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig14 {
    @Bean
    ServiceTest serviceTest() {
        return new ServiceTest();
    }
}
