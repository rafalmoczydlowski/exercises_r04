public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(12,14);
        System.out.println(p.getX());
        System.out.println(p.getY());
        Point p1 = new LabeledPoint("Point 1", 14, 16);
        System.out.println(p1.getY());
        System.out.println(p1.getX());
        System.out.println(((LabeledPoint) p1).getLabel());
    }
}
