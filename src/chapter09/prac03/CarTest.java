package chapter09.prac03;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Sonata());
        carArrayList.add(new Grandeur());
        carArrayList.add(new Avante());
        carArrayList.add(new Genesis());
        for (Car car : carArrayList) {
            car.run();
            System.out.println("=======================================");
        }

    }
}
