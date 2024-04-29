public class VolvoTram extends Tram {
    public VolvoTram() {
        super(10000000, 7);
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public int getUsageCost() {
        return super.getUsageCost();
    }

    @Override
    public void goByRails() {
        System.out.println("The Volvo Tram runs!");
    }
}
