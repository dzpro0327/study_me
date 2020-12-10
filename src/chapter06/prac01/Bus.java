package chapter06.prac01;

public class Bus {
    private int busNum;
    private int passenger;
    private int money;

    public Bus(int busNum) {
        this.busNum = busNum;

    }

    public int getBusNum() {
        return busNum;
    }

    public void setBusNum(int busNum) {
        this.busNum = busNum;
    }

    public int getPassenger() {
        return passenger;
    }

    public int getMoney() {
        return money;
    }

    public void take(int money) {
        this.money += money;
        ++passenger;
    }

    public void showInfo() {
        System.out.println("버스에 있는 승객의 수는 " + passenger+ "명 버스 총 수입은 " + money);
    }
}
