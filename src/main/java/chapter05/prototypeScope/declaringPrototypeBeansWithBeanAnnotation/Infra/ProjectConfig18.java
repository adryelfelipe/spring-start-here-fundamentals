package chapter05.prototypeScope.declaringPrototypeBeansWithBeanAnnotation.Infra;

import chapter05.prototypeScope.declaringPrototypeBeansWithBeanAnnotation.Services.Service;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig18 {
    @Bean("generator")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    Service service() {
        return new Service();
    }
}
