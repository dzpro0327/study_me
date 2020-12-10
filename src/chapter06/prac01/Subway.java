package chapter06.prac01;

public class Subway {
    private int money;
    private int lineNumber;
    private int passenger;

    public int getMoney() {
        return money;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getPassenger() {
        return passenger;
    }

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void showInfo() {
        System.out.println("지하철에 있는 승객의 수는 " + passenger + "명 수입은 " + money + "입니다.");
    }
}
