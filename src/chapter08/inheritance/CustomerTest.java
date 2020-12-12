package chapter08.inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        // 배열을 선언
        ArrayList<Customer> customers = new ArrayList<>();

        // 객체를 생성
        Customer customer1 = new Customer(1001, "SILVER-1");
        Customer customer2 = new Customer(1002, "SILVER-2");
        GoldCustomer goldCustomer1 = new GoldCustomer(1011, "GOLD-1");
        GoldCustomer goldCustomer2 = new GoldCustomer(1012, "GOLD-2");
        VIPCustomer vipCustomer1 = new VIPCustomer(1101, "VIP-1", 12345);

        // 배열에 객체를 추가
        customers.add(customer1);
        customers.add(customer2);
        customers.add(goldCustomer1);
        customers.add(goldCustomer2);
        customers.add(vipCustomer1);

        // 고객정보 반복문으로 인쇄~
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).showCustomerInfo());
        }

        System.out.println("===============================================================");
        System.out.println("===============================================================");
        System.out.println("===============================================================");

        // 할인율과 보너스 포인트 계산
        int price = 10000;

        // 향상된 for 문 1. 배열을 돌릴 변수 먼저 선언  2. 반복을 돌리는 배열명 적기..
        for (Customer customer : customers) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불");
            System.out.println(customer.getCustomerName() + "님의 현재 포인트 " + customer.bonusPoint);

        }
    }
}
