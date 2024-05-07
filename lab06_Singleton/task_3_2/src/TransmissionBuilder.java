public class TransmissionBuilder {
    private Transmission.TransmissionType transmissionType = Transmission.TransmissionType.AUTOMATIC;
    private int gears = 20;

    public TransmissionBuilder setTransmissionType(Transmission.TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public TransmissionBuilder setGears(int gears) {
        this.gears = gears;
        return this;
    }

    public Transmission build() {
        return new Transmission(transmissionType, gears);
    }
}
