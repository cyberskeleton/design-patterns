public class LogisticsCappuccino extends Logistics {
    @Override
    protected Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost) {
        return new CoffeeLatte(beansCost, waterCost, sugarCost, milkCost);
    }
}
