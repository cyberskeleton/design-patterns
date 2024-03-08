public class CoffeeAmericano implements Coffee {
    float sugarCost;
    float waterCost;
    float beansCost;
    //float sellingCost;

    public CoffeeAmericano(float waterCost, float beansCost, float sugarCost) {
        this.waterCost = waterCost;
        this.sugarCost = sugarCost;
        this.beansCost = beansCost;
    }

    @Override
    public float getProductionCost() {
        return sugarCost + waterCost + beansCost;
    }

    @Override
    public float getSellingCost() {
        return getProductionCost() + getProductionCost()/4;
    }

    @Override
    public Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost) {
        return new CoffeeAmericano(beansCost, waterCost, sugarCost);
    }
}
