import java.util.ArrayList;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.sqrt;

public class BiQuadraticEquation extends Equation {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    public BiQuadraticEquation(double a, double b, double c, double d, double e) {
        super(d, e);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public BiQuadraticEquation(BiQuadraticEquation other) {
        super(other.d, other.e);
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
        this.d = other.d;
        this.e = other.e;
    }

    @Override
    ArrayList<Double> solve(){
        ArrayList<Double> solutions = new ArrayList<>();
        //a b c d e
        //p 0 r 0 t

        if (a == 0){
            if (c == 0) {
                if (e == 0) {
                    solutions.add(POSITIVE_INFINITY);
                    return solutions;
                }
                return solutions;
            }
            QuadraticEquation qe = new QuadraticEquation(c, d, e);
            return qe.solve();
        }

        double disc1 = c*c - 4*a*e;
        if (disc1 > 0){
            double x_square1 = -c + sqrt(disc1)/(2*a);
            double x_square2 = -c - sqrt(disc1)/(2*a);

            solutions.add(sqrt(x_square1));
            solutions.add(-sqrt(x_square1));

            solutions.add(sqrt(x_square2));
            solutions.add(-sqrt(x_square2));
            return solutions;
        }

        if (disc1 == 0){
            double x_square1 = -c + sqrt(disc1)/(2*a);

            solutions.add(sqrt(x_square1));
            solutions.add(-sqrt(x_square1));
        }
        return solutions;
    }

    @Override
    public Equation clone() {
        return new BiQuadraticEquation(this);
    }

    @Override
    public String toString() {
        return "BiQuadraticEquation{" +
                a + "x^4+" + c + "x^2+" + e + "=0"
                + "}";
    }
}
