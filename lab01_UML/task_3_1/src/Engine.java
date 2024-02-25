public class Engine {
    String description;
    int powerKW;

    public Engine(String description, int powerKW) {
        this.description = description;
        this.powerKW = powerKW;
    }

    public String getDescription() {
        return description;
    }

    public int getPowerKW() {
        return powerKW;
    }
}
