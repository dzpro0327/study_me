package chapter09.prac01;

public abstract class Car {
    // 추상 메서드
    public abstract void run();
    public abstract void refuel();

    // 일반 메서드
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }

}
