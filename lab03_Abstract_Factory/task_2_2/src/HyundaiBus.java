public class HyundaiBus extends Bus {
    protected HyundaiBus() {
        super(5500000, 20);
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
        System.out.println("The Hyundai Bus runs!");
    }
}
