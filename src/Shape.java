public abstract class Shape {

    protected Point point;


    public Shape(Point other) {
        this.point = other;
    }

    public Shape(Point other, Point other1) {
        this.point = other;
        this.point = other1;
    }

    public void moveBy(double xd, double yd) {
        this.point = new Point(this.point.getX() + xd, this.point.getY() + yd);
    }

    public abstract Point getCenter();
}