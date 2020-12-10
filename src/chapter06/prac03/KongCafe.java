package chapter06.prac03;

public class KongCafe {
    private int money;
    private String menu;

    public KongCafe(String menu) {
        this.menu = menu;
    }

    public int getMoney() {
        return money;
    }

    public String getMenu() {
        return menu;
    }

    public void take(int money) {
        this.money += 4500;

    }

    public void showInfo() {
        System.out.println("가계매출: " + money);
    }
}
