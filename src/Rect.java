public class Rect extends Figure {
    public Rect(double one) {
        setA(one);
        setB(one);
    }

    public Rect(double a, double b) {
        setA(a);
        setB(b);
    }

    @Override
    public double square() {
        return getA()*getB();
    }
}
