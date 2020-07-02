package example.Shape;

import example.Point.Point;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        var x = (2 * this.point.getX() + this.width) / 2;
        var y = (2 * this.point.getY() + this.height) / 2;
        return new Point(x,y);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (this.height * this.width) / 2;
    }
}
