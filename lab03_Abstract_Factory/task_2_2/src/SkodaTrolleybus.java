public class SkodaTrolleybus extends Trolleybus {
    protected SkodaTrolleybus() {
        super(6800000, 12);
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
        System.out.println("The Skoda Trolleybus runs!");
    }
}
