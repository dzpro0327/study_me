package chapter12.test01;

import java.util.HashMap;

public class CarFactory {
    // 1. 생성자 만들기
    private CarFactory() {
    }

    // 2. 전역 인스턴스 생성
    public static CarFactory instance = new CarFactory();
    HashMap<String, Car> carMap = new HashMap<>();

    // 3. 인스턴스 유무 판별
    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    // 4. 인스턴스 만들수 있는 메서드 생성.
    public Car createCar(String name) {
        if(carMap.containsKey(name)) {
            return carMap.get(name);
        }
        Car car = new Car();
        carMap.put(name, car);
        return car;
    }
}
