package chapter08.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer = new Customer(1001, "일반고객");
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer(1101, "VIP", 12345);
        vipCustomer.bonusPoint = 1000;
        System.out.println(vipCustomer.showCustomerInfo());

        GoldCustomer goldCustomer = new GoldCustomer(1011, "GOLD");
        goldCustomer.bonusPoint = 1000;
        System.out.println(goldCustomer.showCustomerInfo());

        System.out.println("=========== 할인율과 보너스 포인트 계산 ===========");

        int price = 10000;
        int customerPrice = customer.calcPrice(price);
        int vipCustomerPrice = vipCustomer.calcPrice(price);
        int goldCustomerPrice = goldCustomer.calcPrice(price);

        System.out.println(customer.getCustomerName() + " 님이 " + customerPrice + "원 지불");
        System.out.println(customer.showCustomerInfo());

        System.out.println(vipCustomer.getCustomerName() + " 님이 " + vipCustomerPrice + "원 지불");
        System.out.println(vipCustomer.showCustomerInfo());

        System.out.println(goldCustomer.getCustomerName() + " 님이 " + goldCustomerPrice + "원 지불");
        System.out.println(goldCustomer.showCustomerInfo());

    }
}
