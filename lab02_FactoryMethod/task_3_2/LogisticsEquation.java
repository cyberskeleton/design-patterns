import java.util.ArrayList;

import static java.lang.Double.*;


public class LogisticsEquation {

    protected Equation maxSolEquation = null;
    protected Equation minSolEquation = null;

    protected double maxSol = NEGATIVE_INFINITY;
    protected double minSol = POSITIVE_INFINITY;

    protected ArrayList<Equation> equationsOneSol = new ArrayList<>();
    protected ArrayList<Equation> equationsTwoSol = new ArrayList<>();
    protected ArrayList<Equation> equationsThreeSol = new ArrayList<>();
    protected ArrayList<Equation> equationsFourSol = new ArrayList<>();

    protected ArrayList<Equation> equationsNoSol = new ArrayList<>();
    protected ArrayList<Equation> equationsInfSol = new ArrayList<>();

    public LogisticsEquation(){
    }

    public Equation buildEquation(double[] coefficients){
        return new Equation(coefficients[0], coefficients[1]);
    }

    public void addEquation(double[] coefficients) {
        Equation equation = buildEquation(coefficients);
        ArrayList<Double> solutions = equation.solve();
        //System.out.println("sol "+solutions.size());
        if (solutions.isEmpty()){
            equationsNoSol.add(equation);
            return;
        }

        switch (solutions.size()){
            case 1:
                //System.out.println("case 1 triggered");
                if (solutions.get(0) == POSITIVE_INFINITY){
                    equationsInfSol.add(equation);
                    return;
                    }
                else {
                    if (solutions.get(0) < minSol){
                        minSol = solutions.get(0);
                        minSolEquation = equation;
                    }
                    if (solutions.get(0) > maxSol){
                        maxSol = solutions.get(0);
                        maxSolEquation = equation;
                    }
                    equationsOneSol.add(equation);
                    return;
                }
            case 2:
                //System.out.println("case 2 triggered");
                equationsTwoSol.add(equation);
                return;

            case 3:
                //System.out.println("case 3 triggered");
                equationsThreeSol.add(equation);
                return;

            case 4:
                //System.out.println("case 4 triggered");
                equationsFourSol.add(equation);
                return;

            default:
                System.out.println("Unknown solution size");
        }
    }

    public void mergeEquations(LogisticsEquation logisticsEquation) {
        equationsNoSol.addAll(logisticsEquation.equationsNoSol);
        equationsInfSol.addAll(logisticsEquation.equationsInfSol);
        equationsOneSol.addAll(logisticsEquation.equationsOneSol);
        equationsTwoSol.addAll(logisticsEquation.equationsTwoSol);
        equationsThreeSol.addAll(logisticsEquation.equationsThreeSol);
        equationsFourSol.addAll(logisticsEquation.equationsFourSol);
    }

    public void display(){
        System.out.println("Equation with minimal solution "+minSol);
        //System.out.println(minSolEquation);
        minSolEquation.show();

        System.out.println("\nEquation with maximal solution "+maxSol);
        //System.out.println(maxSolEquation);
        maxSolEquation.show();

        System.out.println("\nEquations with no solutions");// + equationsNoSol);
        for (Equation equation : equationsNoSol) {
                equation.show();
        }

        System.out.println("\nEquations with infinite solutions");// + equationsInfSol);
        for (Equation equation : equationsInfSol) {
            equation.show();
        }

        System.out.println("\nEquations with 1 solution");// + equationsOneSol);
        for (Equation equation : equationsOneSol) {
            equation.show();
        }

        System.out.println("\nEquations with 2 solutions");// + equationsTwoSol);
        for (Equation equation : equationsTwoSol) {
            equation.show();
        }

        System.out.println("\nEquations with 3 solutions");// + equationsThreeSol);
        for (Equation equation : equationsThreeSol) {
            equation.show();
        }

        System.out.println("\nEquations with 4 solutions");// + equationsFourSol);
        for (Equation equation : equationsFourSol) {
            equation.show();
        }
    }


}
