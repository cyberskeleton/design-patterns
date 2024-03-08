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
            //System.out.println("Two solutions" + (-b + sqrt(disc))/(2*a) + " " + (-b - sqrt(disc))/(2*a));
            solutions.add((-b + sqrt(disc))/(2*a));
            solutions.add((-b + sqrt(disc))/(2*a));
            return solutions;
        }
        if (disc == 0){
            //System.out.println("One solution" + (-b + sqrt(disc))/(2*a));
            solutions.add((-b + sqrt(disc))/(2*a));
        }
        return solutions;
    }

    @Override
    void show(){
        System.out.println(a+"x^2+"+b+"x+"+c+"=0");
    }

}
