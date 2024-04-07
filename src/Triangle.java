public class Triangle extends Figure {
    private double c;

    public Triangle(double one) {
        setA(one);
        setB(one);
        this.c = one;
    }

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        this.c = c;
    }

    @Override
    public double square() {
        double pp = (getA()+getB()+c)/2;
        return Math.sqrt(pp*(pp-getA())*(pp-getB())*(pp-c));
    }
}
