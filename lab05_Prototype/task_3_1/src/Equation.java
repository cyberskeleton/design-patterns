import java.util.ArrayList;
import static java.lang.Double.POSITIVE_INFINITY;


 public class Equation implements Prototype {
    private final double a;
    private final double b;

    public Equation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    ArrayList<Double> solve(){
        ArrayList<Double> solutions = new ArrayList<Double>();
        if (a == 0){
            if (b == 0) {
                solutions.add(POSITIVE_INFINITY);
                return solutions;
            }
            return solutions;
        }

        solutions.add(-b/a);
        return solutions;

    }


    public Equation(Equation other) {
        this.a = other.a;
        this.b = other.b;
    }

    @Override
    public String toString() {
        return "Equation{" + a +
                "x+" + b + "= 0"
                + "}";
    }

     @Override
     public Equation clone() {
         return new Equation(this);
     }

 }
