package chapter03.definingRelationshipsAmongBeans.autowiringTwoDefinedBeans.Models;

public class Person2 {
    private String name;
    private Parrot7 parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot7 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot7 parrot) {
        this.parrot = parrot;
    }
}
