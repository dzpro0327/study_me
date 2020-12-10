package chapter06.prac01;

public class Taxi {
    private int money;
    private int carNumber;
    private int passenger;

    public Taxi(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getMoney() {
        return money;
    }


    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getPassenger() {
        return passenger;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void showInfo() {
        System.out.println("택시에 있는 승객의 수는 " + passenger + "명 수입은 " + money);
    }
}
