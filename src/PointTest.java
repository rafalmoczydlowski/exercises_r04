public class PointTest {
    public static void main(String[] args) {
        final String ACTION_1 = "The center of the figure is at the point: ";

        Point p = new Point(12,14);
        Point p1 = new Point(12, 14);
        System.out.println(p.toString());
        System.out.println(p.equals(p1));
        System.out.println("===================================");
        LabeledPoint r = new LabeledPoint("LabeledPoint 1", 14, 16);
        LabeledPoint r1 = new LabeledPoint("LabeledPoint 2", 14, 16);
        System.out.println(r.toString());
        System.out.println(r.equals(r1));
        System.out.println(r.hashCode() + " " + r1.hashCode());
        System.out.println("===========LINE============");
        Line line = new Line(new Point(12,14), new Point(10, 18));
        System.out.println("X: " + line.point.getX());
        System.out.println("Y: " + line.point.getY());
        System.out.println(ACTION_1 + line.getCenter());
        line.moveBy(10,10);
        System.out.println("New line points: X = " + line.point.getX() + ", Y = " + line.point.getY());
        System.out.println("==========RECTANGLE=========");
        Rectangle rectangle = new Rectangle(new Point(12, 14), 10, 5);
        System.out.println("X: " + rectangle.point.getX());
        System.out.println("Y: " + rectangle.point.getY());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println(ACTION_1 + rectangle.getCenter());
        rectangle.moveBy(10, 10);
        System.out.println("New rectangle created. " + ACTION_1 + rectangle.getCenter());
        System.out.println("==========CIRCLE=========");
        Circle circle = new Circle(new Point(6, 6), 6);
        System.out.println("X: " + circle.point.getX());
        System.out.println("Y: " + circle.point.getY());
        System.out.println("X: " + circle.getRadius());
        System.out.println(ACTION_1 + circle.getCenter());
    }
}
