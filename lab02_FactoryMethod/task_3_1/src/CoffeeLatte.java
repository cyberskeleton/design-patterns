public class CoffeeLatte implements Coffee {
    float sugarCost;
    float waterCost;
    float beansCost;
    float milkCost;
    //float sellingCost;

    public CoffeeLatte(float beansCost, float waterCost, float sugarCost, float milkCost) {
        this.waterCost = waterCost;
        this.milkCost = milkCost;
        this.sugarCost = sugarCost;
        this.beansCost = beansCost;
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
        return new CoffeeLatte(waterCost, beansCost, sugarCost, milkCost);
    }
}
