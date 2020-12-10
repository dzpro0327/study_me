package chapter06.prac03;

public class Person {
    private String personName;
    private int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeStarCoffee(StarCafe starCafe) {
        starCafe.take(4000);
        this.money -= 4000;
    }

    public void takeKongCoffee(KongCafe kongCafe) {
        kongCafe.take(4500);
        this.money -= 4500;
    }

    public void personInfo() {
        System.out.println(personName + "님의 남은 금액은 " + money + "입니다.");
    }
}
