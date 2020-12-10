package chapter06.prac03;

public class StarCafe {
    private int money;
    private String menu;

    public StarCafe(String menu) {
        this.menu = menu;
    }

    public void take(int money) {
        this.money += 4000;

    }

    public void showInfo() {
        System.out.println("가계매출: " + money);
    }

    public int getMoney() {
        return money;
    }


    public String getMenu() {
        return menu;
    }


}
