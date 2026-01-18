package chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInConstructors.Models;

import org.springframework.stereotype.Component;

@Component
public class Parrot9 {
    // Attribute
    private String name;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
