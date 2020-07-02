package example.Shape;

import example.Point.Point;

import static java.lang.Math.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }


    @Override
    public Point getCenter() {
        return this.point;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * pow(radius, 2);
    }
}
