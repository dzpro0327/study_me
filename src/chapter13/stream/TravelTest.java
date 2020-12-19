package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("이동주1", 20, 100);
        TravelCustomer customer2 = new TravelCustomer("이동주2", 40, 100);
        TravelCustomer customer3 = new TravelCustomer("이동주3", 10, 50);
        List<TravelCustomer> list = new ArrayList<>();
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        list.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        System.out.println("== 총 여행비용 ==");
        int total = list.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(total + "만원");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        list.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(
                s -> System.out.println(s));
    }
}
