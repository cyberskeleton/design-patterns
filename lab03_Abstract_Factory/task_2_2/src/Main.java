import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        VolvoFactory volvoFactory = new VolvoFactory();
        SkodaFactory skodaFactory = new SkodaFactory();
        HyundaiFactory hyundaiFactory = new HyundaiFactory();

        ArrayList<Vehicle> volvoVehicles = new ArrayList<>();
        ArrayList<Vehicle> skodaVehicles = new ArrayList<>();
        ArrayList<Vehicle> hyundaiVehicles = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        for (int i = 0; i < A; i++) {
            Bus volvoBus = volvoFactory.createBus();
            volvoVehicles.add(volvoBus);

            Bus skodaBus = skodaFactory.createBus();
            skodaVehicles.add(skodaBus);

            Bus hyundaiBus = hyundaiFactory.createBus();
            hyundaiVehicles.add(hyundaiBus);
        }

        for (int i = 0; i < T; i++) {
            Tram volvoTram = volvoFactory.createTram();
            volvoVehicles.add(volvoTram);

            Tram skodaTram = skodaFactory.createTram();
            skodaVehicles.add(skodaTram);

            Tram hyundaiTram = hyundaiFactory.createTram();
            hyundaiVehicles.add(hyundaiTram);
        }

        for (int i = 0; i < Tr; i++) {
            Trolleybus volvoTrolleybus = volvoFactory.createTrolleybus();
            volvoVehicles.add(volvoTrolleybus);

            Trolleybus skodaTrolleybus = skodaFactory.createTrolleybus();
            skodaVehicles.add(skodaTrolleybus);

            Trolleybus hyundaiTrolleybus = hyundaiFactory.createTrolleybus();
            hyundaiVehicles.add(hyundaiTrolleybus);
        }

        int finalCostContractVolvo = 0;
        int finalCostContractSkoda = 0;
        int finalCostContractHyundai = 0;

        for (Vehicle vehicle : volvoVehicles) {
            finalCostContractVolvo += vehicle.getCost() + vehicle.getUsageCost() * N;
        }

        for (Vehicle vehicle : skodaVehicles) {
            finalCostContractSkoda += vehicle.getCost() + vehicle.getUsageCost() * N;
        }

        for (Vehicle vehicle : hyundaiVehicles) {
            finalCostContractHyundai += vehicle.getCost() + vehicle.getUsageCost() * N;
        }

        System.out.println("Final cost of contract with Volvo:");
        System.out.println(finalCostContractVolvo);

        System.out.println("Final cost of contract with Skoda:");
        System.out.println(finalCostContractSkoda);

        System.out.println("Final cost of contract with Hyundai:");
        System.out.println(finalCostContractHyundai);
    }
}
