public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        Car redMechanicalSUV = director.createRedMechanicalSUV();
        System.out.println(redMechanicalSUV);

        Car blackAutomaticSedan = director.createBlackAutomaticSedan();
        System.out.println(blackAutomaticSedan);
    }
}
