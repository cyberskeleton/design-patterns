public class VolvoBus extends Bus {

    protected VolvoBus() {
        super(6000000, 20);
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
        System.out.println("The Volvo bus runs!");
    }
}
