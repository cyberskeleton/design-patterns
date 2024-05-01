public class Main {
    public static void main(String[] args) {
        Equation linearEquation = new Equation(2, 1);
        System.out.println(linearEquation.toString());
        System.out.println(linearEquation.solve());
        Equation linearClone = linearEquation.clone();
        System.out.println(linearClone.toString());
        System.out.println(linearClone.solve());

        Equation quadraticEquation = new QuadraticEquation(6, 11, -35);
        System.out.println(quadraticEquation.toString());
        System.out.println(quadraticEquation.solve());
        Equation quadraticClone = quadraticEquation.clone();
        System.out.println(quadraticClone.toString());
        System.out.println(quadraticClone.solve());

        Equation biQudraticEquation = new BiQuadraticEquation(1, 0, -3, 0 , 2);
        System.out.println(biQudraticEquation.toString());
        System.out.println(biQudraticEquation.solve());
        Equation biQudraticClone = biQudraticEquation.clone();
        System.out.println(biQudraticClone.toString());
        System.out.println(biQudraticClone.solve());
    }
}
