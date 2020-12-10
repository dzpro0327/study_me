package chapter06.singleton.prac01;

public class CarFactory {

    // 1. 생성자 private만들기
    private CarFactory() {
    }

    // 2. static 유일한 인스턴스 생성하기
    private static CarFactory instance = new CarFactory();

    // 3. 외부에서 참조 가능하게 메서드 만들기
    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    // 인스턴스를 만들어 주는 객체 만들기
    public Car createCar() {
        Car car = new Car();
        return car;
    }


}
