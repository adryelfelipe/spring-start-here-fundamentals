package chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Repositories;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Repository
public class PrototypeRepository {
}
