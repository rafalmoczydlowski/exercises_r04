package example.Shape;

import example.Point.Point;

public class Line extends Shape {

    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super(null);
        this.from = from;
        this.to = to;
        var centerX = (this.from.getX() + this.to.getX()) / 2;
        var centerY = (this.from.getY() + this.to.getY()) / 2;
        this.point = new Point(centerX, centerY);
    }

    @Override
    public Line clone(){
        return new Line(this.from, this.to);
    }

    @Override
    public Point getCenter() {
        return this.point;
    }

    @Override
    public void moveBy(double xd, double yd) {
        super.moveBy(xd, yd);
        this.from = new Point(this.from.getX() + xd, this.from.getY() + yd);
        this.to = new Point (this.to.getX() + xd, this.from.getY() + yd);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
