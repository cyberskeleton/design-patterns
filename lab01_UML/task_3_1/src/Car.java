public class Car {
    private Wheel wheel;
    private Engine engine;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    Car(CarBuilder carBuilder) {
        wheel = carBuilder.wheel;
        engine = carBuilder.engine;
    }
}
