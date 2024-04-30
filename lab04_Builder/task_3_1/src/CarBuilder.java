public class CarBuilder {
    private Car.Type type = Car.Type.Sedan;
    private Car.CarColor carColor = Car.CarColor.Black;
    private Engine engine;
    private Wheel wheel;
    private Transmission transmission;

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car build() {
        return new Car(type, carColor, engine, wheel, transmission);
    }
}
