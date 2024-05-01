import java.util.ArrayList;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.sqrt;


public class QuadraticEquation extends Equation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other.b, other.c);
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;

    }

    @Override
    ArrayList<Double> solve(){
        ArrayList<Double> solutions = new ArrayList<>();

        if (a == 0){
            if (b == 0) {
                if (c == 0) {
                    solutions.add(POSITIVE_INFINITY);
                    return solutions;
                }
                return solutions;
            }
            return super.solve();
        }

        double disc = b*b - 4*a*c;
        if (disc > 0){
            solutions.add((-b + sqrt(disc))/(2*a));
            solutions.add((-b + sqrt(disc))/(2*a));
            return solutions;
        }
        if (disc == 0){
            solutions.add((-b + sqrt(disc))/(2*a));
        }
        return solutions;
    }


    @Override
    public String toString() {
        return "QuadraticEquation{" + a +
                "x^2+" + b + "x+" + c + "= 0"
                + "}";
    }

    @Override
    public Equation clone() {
        return new QuadraticEquation(this);
    }
}
