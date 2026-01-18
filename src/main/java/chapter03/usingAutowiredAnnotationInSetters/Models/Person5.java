package chapter03.usingAutowiredAnnotationInSetters.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person5 {
    // Attributes
    private String name;

    @Autowired
    private Parrot10 parrot;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot10 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot10 parrot) {
        this.parrot = parrot;
    }
}
