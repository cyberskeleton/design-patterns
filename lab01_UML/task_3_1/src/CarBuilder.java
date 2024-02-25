
public class CarBuilder {
    Wheel wheel;
    Engine engine;

    public CarBuilder() {
    }

    public CarBuilder wheel(Wheel val) {
        wheel = val;
        return this;
    }

    public CarBuilder engine(Engine val) {
        engine = val;
        return this;
    }
    public Car build() {
        return new Car(this);
    }
}

