package chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Models;

import chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models.Parrot12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person6AutowiredExample {
    // Attributes
    private String name;
    private Parrot11 parrot;

    // Constructor
    @Autowired
    public Person6AutowiredExample(Parrot11 max) {
        this.parrot = max;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot11 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot11 parrot) {
        this.parrot = parrot;
    }
}
