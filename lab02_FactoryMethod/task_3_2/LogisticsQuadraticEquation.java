public class LogisticsQuadraticEquation extends LogisticsEquation {

    @Override
    public Equation buildEquation(double[] coefficients) {
        return new QuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
    }
}
