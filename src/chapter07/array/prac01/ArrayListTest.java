package chapter07.array.prac01;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book("태백산맥", "조정래"));
        list.add(new Book("데미안", "헤르만 헤세"));
        list.add(new Book("어떻게 살 것인가", "유시민"));
        list.add(new Book("토지", "박경리"));
        list.add(new Book("어린왕자", "생텍쥐페리"));

        for(int i=0; i<list.size(); i++) {
             Book book = list.get(i);
             book.showInfo();
        }

        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");


        // 향상된 for문
        for(Book book : list) {
            book.showInfo();

        }


    }
}
