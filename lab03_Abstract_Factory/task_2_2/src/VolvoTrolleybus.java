public class VolvoTrolleybus extends Trolleybus {
    protected VolvoTrolleybus() {
        super(7000000, 13);
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
    public void goByContactNetwork() {
        System.out.println("The Volvo Trolleybus runs");
    }
}
