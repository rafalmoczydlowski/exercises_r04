public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(12,14);
        Point p1 = new Point(12, 14);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.toString());
        System.out.println(p.equals(p1));
        System.out.println(p.hashCode() + " " + p1.hashCode());
        System.out.println("===================================");
        Point r = new LabeledPoint("Point 1", 14, 16);
        Point r1 = new LabeledPoint("Point 2", 14, 16);
        System.out.println(r.getY());
        System.out.println(r.getX());
        System.out.println(((LabeledPoint) r).getLabel());
        System.out.println(r.toString());
        System.out.println(r.equals(r1));
        System.out.println(r.hashCode() + " " + r1.hashCode());
    }
}
