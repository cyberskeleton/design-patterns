public class EngineBuilder {
    private Engine.Fuel engineFuel = Engine.Fuel.Petrol;
    private int power = 1000;
    private int torque = 25;
    private int volume = 60;

    public EngineBuilder setFuel(Engine.Fuel engineFuel) {
        this.engineFuel = engineFuel;
        return this;
    }

    public EngineBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public Engine build() {
        return new Engine(power, torque, engineFuel, volume);
    }


}
