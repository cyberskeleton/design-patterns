public class SkodaTram extends Tram {
    protected SkodaTram() {
        super(9000000, 8);
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
        System.out.println("The Skoda Tram runs!");
    }
}
