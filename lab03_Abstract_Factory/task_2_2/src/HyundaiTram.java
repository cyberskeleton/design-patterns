public class HyundaiTram extends Tram {
    protected HyundaiTram() {
        super(9500000, 6);
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
        System.out.println("The Hyundai Tram runs!");
    }
}
