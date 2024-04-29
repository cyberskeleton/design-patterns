public class SkodaBus extends Bus {
    protected SkodaBus() {
        super(4500000, 25);
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
    public void goByWay() {
        System.out.println("The Skoda Bus runs!");
    }
}
