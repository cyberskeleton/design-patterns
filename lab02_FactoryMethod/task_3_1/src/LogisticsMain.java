public class LogisticsMain {
    public static void main(String[] args) {
        Logistics logistics = new LogisticsLatte();
        logistics.sellCoffee(22, 34, 67, 8);

        Logistics logistics1 = new LogisticsLatte();
        logistics1.sellCoffee(56, 42, 11, 89);

        Logistics logistics2 = new LogisticsLatte();
        logistics2.sellCoffee(12, 44, 56, 90);

        Logistics logistics3 = new LogisticsLatte();
        logistics3.sellCoffee(24, 16, 67, 7);
    }
}
