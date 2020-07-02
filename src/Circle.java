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
}
