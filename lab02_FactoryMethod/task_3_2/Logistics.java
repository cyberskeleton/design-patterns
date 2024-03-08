import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        ArrayList<double[]> coefficients = readData("input01.txt");
        //System.out.println(coefficients);
        System.out.println("Running for input 1...\n");
        run(coefficients);

        ArrayList<double[]> coefficients2 = readData("input02.txt");
        System.out.println("\nRunning for input 2...\n");
        run(coefficients2);

        ArrayList<double[]> coefficients3 = readData("input03.txt");
        System.out.println("\nRunning for input 3...\n");
        run(coefficients3);
    }

    public static ArrayList<double[]> readData(String filename){
        ArrayList<double[]> coefficientsList = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isBlank()){
                    break;
                }

                //System.out.println("line"+line);
                String[] stringArray = line.trim().split("\\s+");
                //System.out.println(Arrays.toString(stringArray));
                double[] doubleArray = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();
                //System.out.println(Arrays.toString(doubleArray));
                coefficientsList.add(doubleArray);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return coefficientsList;
    }

    public static void run(ArrayList<double[]> coefficients){

        LogisticsEquation logisticsEquation = new LogisticsEquation();
        LogisticsQuadraticEquation logisticsQuadraticEquation = new LogisticsQuadraticEquation();
        LogisticsBiQuadraticEquation logisticsBiQuadraticEquation = new LogisticsBiQuadraticEquation();

        for (double[] coef : coefficients){
            //System.out.println(Arrays.toString(coef));
            //System.out.println(coef.length);
            switch (coef.length){
                case 2:
                    //System.out.println("switch 2");
                    logisticsEquation.addEquation(coef);
                    break;

                case 3:
                    //System.out.println("switch 3");
                    logisticsQuadraticEquation.addEquation(coef);
                    break;

                case 5:
                    //System.out.println("switch 5");
                    logisticsBiQuadraticEquation.addEquation(coef);
                    break;

                default:
                    System.out.println("Input not recognised");
            }
        }
        logisticsEquation.mergeEquations(logisticsQuadraticEquation);
        logisticsEquation.mergeEquations(logisticsBiQuadraticEquation);
        logisticsEquation.display();
    }

}
