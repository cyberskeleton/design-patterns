public class VolvoFactory implements VehicleFactory {
    @Override
    public Bus createBus() {
        return new VolvoBus();
    }

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }

}
