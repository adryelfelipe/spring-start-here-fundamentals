package chapter02.usingStereotypeAnnotations.componentAnnotation.Models;

import org.springframework.stereotype.Component;

@Component
public class Parrot3 {
    // Attributes
    private String name;

    // Getters
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}
