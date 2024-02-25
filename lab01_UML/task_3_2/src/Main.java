public class Main {
    public static void main(String[] args) {

        Creator creator1 = new ConcreteCreator1();
        Creator creator2 = new ConcreteCreator2();

        Product product1 = creator1.createProduct();
        Product product2 = creator2.createProduct();

        product1.doSomething();
        product2.doSomething();

        System.out.println("Hello!");
    }
}
