public class CoffeeCappuccino implements Coffee {
    float sugarCost;
    float waterCost;
    float beansCost;
    float milkCost;
    //float sellingCost;

    public CoffeeCappuccino(float beansCost, float waterCost, float sugarCost, float milkCost) {
        this.waterCost = waterCost;
        this.sugarCost = sugarCost;
        this.beansCost = beansCost;
        this.milkCost = milkCost;
    }

    @Override
    public float getProductionCost() {
        return sugarCost + waterCost + beansCost + milkCost;
    }

    @Override
    public float getSellingCost() {
        return getProductionCost() + getProductionCost()/4;
    }

    @Override
    public Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost) {
        return new CoffeeCappuccino(beansCost, waterCost, sugarCost, milkCost);
    }
}
