package chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Services;

import chapter05.singletonScope.declaringSigletonBeansWithStereotypeAnnotations.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest2 {
    @Autowired
    private TestRepository testRepository;

    public TestRepository getTestRepository() {
        return testRepository;
    }
}
