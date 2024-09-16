package jaf.example.objects;

public class Greeting {
    private String name;

    public Greeting() {
        this.name = "Nobody";
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hallo " + name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
