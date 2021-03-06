package example.Shape;

import example.Point.Point;

public abstract class Shape implements Cloneable{

    public Point point;

    public Shape(Point other) {
        this.point = other;
    }

    public void moveBy(double xd, double yd) {
        this.point = new Point(this.point.getX() + xd, this.point.getY() + yd);
    }

    public abstract Point getCenter();

    public abstract double getArea();

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}