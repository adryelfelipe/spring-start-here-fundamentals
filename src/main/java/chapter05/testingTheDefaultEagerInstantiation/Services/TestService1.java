package chapter05.testingTheDefaultEagerInstantiation.Services;

import org.springframework.stereotype.Service;

@Service
public class TestService1 {
    public TestService1() {
        System.out.println("Initializing the bean testService... ");
    }
}
