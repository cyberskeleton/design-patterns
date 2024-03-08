public class LogisticsEspresso extends Logistics {
    @Override
    protected Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost) {
        return new CoffeeEspresso(beansCost, waterCost, sugarCost);
    }
}
