package chapter06.prac01;

public class Student {
    private String name;
    private int money;
    private int grade;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void takeBus(Bus bus) {
        bus.take(1500);
        this.money -= 1500;

    }

    public void takeSubway(Subway subway) {
        subway.take(2000);
        this.money -= 2000;

    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(3000);
        this.money -= 3000;

    }

    public void studentInfo() {
        System.out.println("학생이 가지고 있는 돈은 " + money + "입니다.");
    }
}
