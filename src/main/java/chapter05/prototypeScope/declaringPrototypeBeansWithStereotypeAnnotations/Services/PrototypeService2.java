package chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Services;

import chapter05.prototypeScope.declaringPrototypeBeansWithStereotypeAnnotations.Repositories.PrototypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PrototypeService2 {
    private PrototypeRepository repository;

    public PrototypeService2(PrototypeRepository repository) {
        this.repository = repository;
    }

    public PrototypeRepository getRepository() {
        return repository;
    }
}
