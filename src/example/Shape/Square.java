package example.Shape;

import example.Point.Point;

import static java.lang.Math.*;

public class Square extends Shape {
    private double squareSide;

    public Square(Point downLeft, double squareSide) {
        super(downLeft);
        this.squareSide = squareSide;
    }

    @Override
    public Point getCenter() {
        var a = (squareSide * sqrt(2))/2;
        var b = squareSide/2;
        var c = sqrt(pow(a, 2) - pow(b, 2));
        var x = this.point.getX() + c;
        var y = this.point.getY() + c;
        return new Point(x, y);
    }

    @Override
    public double getArea() {
        return pow(squareSide, 2);
    }
}
