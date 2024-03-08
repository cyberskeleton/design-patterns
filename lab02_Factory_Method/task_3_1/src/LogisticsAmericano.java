public class LogisticsAmericano extends Logistics {
    @Override
    protected Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost) {
        return new CoffeeAmericano(beansCost, waterCost, sugarCost);
    }
}
