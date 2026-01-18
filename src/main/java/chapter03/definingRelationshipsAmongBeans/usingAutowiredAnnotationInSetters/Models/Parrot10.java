package chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInSetters.Models;

import org.springframework.stereotype.Component;

@Component
public class Parrot10 {
    // Attributes
    private String name;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
