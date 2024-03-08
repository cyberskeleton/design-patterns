public interface Coffee {
    float getProductionCost();
    float getSellingCost();
    Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost);
}
