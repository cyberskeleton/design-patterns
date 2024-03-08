import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.lang.Double.POSITIVE_INFINITY;

public class Equation {
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
                //System.out.println("Infinite solutions");
                solutions.add(POSITIVE_INFINITY);
                return solutions;
            }
            return solutions;
        }
        //System.out.println("Solution " + -b /a);
        solutions.add(-b/a);
        return solutions;

    }

    void show(){
        System.out.println(a+"x+"+b+"=0");
    }
}
