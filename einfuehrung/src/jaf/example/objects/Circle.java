package jaf.example.objects;

import java.util.Random;

public class Circle {
    public final double radius;

    public Circle() {
        this.radius = new Random().nextDouble(10);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
