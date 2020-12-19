package chapter13.test01;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("자바", 25000));
        list.add(new Book("파이썬", 15000));
        list.add(new Book("안드로이드", 30000));
        
        // 스트림으로 출력
        System.out.println("모든 책의 가격의 합");
        int sum_price = list.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(sum_price);

        // 2만원 이상인 책의 이름을 정렬..
        System.out.println("2만원 이상의 책 이름 정렬");
        list.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted().
                forEach(c -> System.out.println(c));
        
    }
}
