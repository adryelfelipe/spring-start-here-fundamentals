package chapter05.testingTheLazyInstantiation.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class TestService2 {
    public TestService2() {
        System.out.println("Initializing the bean testService... ");
    }
}
