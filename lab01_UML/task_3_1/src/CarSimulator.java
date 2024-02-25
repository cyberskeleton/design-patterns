import java.util.Objects;

public class CarSimulator {

    public static void main(String[] args) {
        String attribute = "powerful";
        String shape = "round";

        Car newCar = new CarBuilder()
            .engine(new Engine(attribute, 500))
            .wheel(new Wheel(shape, 20))
            .build();
        Engine engine = newCar.getEngine();
        Wheel wheel = newCar.getWheel();

        assert Objects.equals(engine.description, attribute);
        assert Objects.equals(engine.powerKW, 500);
        assert Objects.equals(wheel.description, shape);
        assert Objects.equals(wheel.sizeInches, 20);
    }
}
