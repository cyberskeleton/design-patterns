public class SkodaFactory implements VehicleFactory {
    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }
}
