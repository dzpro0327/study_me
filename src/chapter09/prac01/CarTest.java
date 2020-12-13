package chapter09.prac01;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        System.out.println("========================");
        bus.run();
        autoCar.run();

        System.out.println("========================");
        bus.refuel();
        autoCar.refuel();

        System.out.println("========================");
        bus.takePassenger();
        autoCar.load();

        System.out.println("========================");
        bus.stop();
        autoCar.stop();
    }
}
