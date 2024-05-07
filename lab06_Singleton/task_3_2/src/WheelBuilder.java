public class WheelBuilder {
    private Wheel.Material wheelMaterial = Wheel.Material.Steel;
    private int diameter = 20;

    public WheelBuilder setWheelMaterial(Wheel.Material wheelMaterial) {
        this.wheelMaterial = wheelMaterial;
        return this;
    }

    public WheelBuilder setWheelDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public Wheel build() {
        return new Wheel(wheelMaterial, diameter);
    }

}
