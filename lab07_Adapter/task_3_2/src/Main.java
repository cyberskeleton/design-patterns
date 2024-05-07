import com.customs.AdapterCustoms;
import com.customs.Auto;
import com.customs.Customs;
import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator carCalculator = new CarCalculator();
        carCalculator.setVehicle(vehicle);
        System.out.println(carCalculator.calculatePrice());

        Auto auto = new Auto(15, true, 350_000,"Fiat 124");
        Customs customs = new AdapterCustoms(carCalculator, new TruckCalculator());
        System.out.println("Fiat 124 price with tax:"+(customs.vehiclePrice(auto)+customs.tax(auto))+" UAH");
        //System.out.println("Fiat 124 tax:"+convertUSDtoUAH(customs.tax(auto))+" UAH");

        Auto auto2 = new Auto(3, false, 160_000,"truck");
        System.out.println("Truck price with tax:"+(customs.vehiclePrice(auto2)+customs.tax(auto2))+" UAH");
        //System.out.println("Truck tax:"+convertUSDtoUAH(customs.tax(auto2))+" UAH");

        Auto auto3 = new Auto(2, true, 50_000,"Tesla");
        System.out.println("Tesla price with tax:"+(customs.vehiclePrice(auto3)+customs.tax(auto3))+" UAH");
        //System.out.println("Tesla tax:"+convertUSDtoUAH(customs.tax(auto3))+" UAH");
    }

}

