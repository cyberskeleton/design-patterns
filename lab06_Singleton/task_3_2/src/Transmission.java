public class Transmission implements Part {
    public enum TransmissionType {
        AUTOMATIC,
        MECHANIC,
    }

    final TransmissionType transmissionType;
    final int gears;

    public Transmission(TransmissionType transmissionType, int gears) {
        this.transmissionType = transmissionType;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "TransmissionType"
                + transmissionType +
                ", gears" + gears +
                '}';
    }

}
