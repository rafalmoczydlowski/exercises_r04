import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " [Label: " + label + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        LabeledPoint other = (LabeledPoint) otherObject;
        return label == other.label;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(label);
    }
}
