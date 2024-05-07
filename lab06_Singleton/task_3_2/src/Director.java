public class Director {
    private Director() {}

    private static Director instance = null;

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    public Car createBlackAutomaticSedan() {
        CarBuilder carBuilder = new CarBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();

        Wheel wheel = wheelBuilder
                .setWheelMaterial(Wheel.Material.Alloy)
                .setWheelDiameter(20)
                .build();

        Engine engine = engineBuilder
                .setFuel(Engine.Fuel.Petrol)
                .setPower(600)
                .setTorque(35)
                .setVolume(30)
                .build();

        Transmission transmission = transmissionBuilder
                .setTransmissionType(Transmission.TransmissionType.AUTOMATIC)
                .setGears(15)
                .build();

        return carBuilder
                .setType(Car.Type.Sedan)
                .setColor(Car.CarColor.Black)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();
    }

    public Car createRedMechanicalSUV() {
        CarBuilder carBuilder = new CarBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();

        Wheel wheel = wheelBuilder
                .setWheelMaterial(Wheel.Material.Steel)
                .setWheelDiameter(45)
                .build();

        Engine engine = engineBuilder
                .setFuel(Engine.Fuel.Diesel)
                .setPower(7500)
                .setTorque(60)
                .setVolume(80)
                .build();

        Transmission transmission = transmissionBuilder
                .setTransmissionType(Transmission.TransmissionType.MECHANIC)
                .setGears(15)
                .build();

        return carBuilder
                .setType(Car.Type.SUV)
                .setColor(Car.CarColor.Red)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();
    }
}
