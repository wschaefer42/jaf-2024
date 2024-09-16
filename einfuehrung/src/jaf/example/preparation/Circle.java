package jaf.example.preparation;

import java.util.Random;

public class Circle {
    private final double radius;

    public Circle() {
        radius = new Random().nextDouble(50);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
