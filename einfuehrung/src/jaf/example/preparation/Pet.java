package jaf.example.preparation;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    private final String name;
    protected static final List<Pet> perts = new ArrayList<>();
    public abstract String speak();

    public Pet(String name) {
        this.name = name;
    }

    public static List<Pet> getPets() {
        return perts;
    }

    public String getName() {
        return name;
    }
}
