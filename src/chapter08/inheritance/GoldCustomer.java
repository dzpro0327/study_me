package chapter08.inheritance;

public class GoldCustomer extends Customer{
    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + " 입니다. ";
    }}
