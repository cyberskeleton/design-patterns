public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Car redMechanicalSUV = director.createRedMechanicalSUV();
        System.out.println(redMechanicalSUV);
    }
}
