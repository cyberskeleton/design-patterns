public abstract class Logistics {

    public Logistics(){
    }

    abstract protected Coffee makeCoffee(float beansCost, float waterCost, float sugarCost, float milkCost);

    public void sellCoffee(float beansCost, float waterCost, float sugarCost, float milkCost){
        Coffee coffee = makeCoffee(beansCost, waterCost, sugarCost, milkCost);

        float totalCost = coffee.getSellingCost();
        System.out.println("Order costs " + totalCost);
    }
}
