package chapter09.template;

public class CarTest {
    public static void main(String[] args) {
        AICar aiCar = new AICar();
        ManualCar manualCar = new ManualCar();

        System.out.println("AICar");
        aiCar.run();

        System.out.println("===================================");

        System.out.println("manualCar");
        manualCar.run();
    }
}
