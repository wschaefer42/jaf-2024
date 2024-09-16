package jaf.example.preparation;

public class AnimalHome {
    public static void main(String[] args) {
        Dog.createDog("Fido").setRace("Dackel");
        Dog augustus = Dog.createDog("Augustus");
        augustus.setRace("Schäferhund");
        System.out.println(augustus.speak());
        System.out.println(Dog.getPets());
    }
}
