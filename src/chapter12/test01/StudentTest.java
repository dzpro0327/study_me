package chapter12.test01;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("100", "홍길동1"));
        hashSet.add(new Student("200", "홍길동2"));
        hashSet.add(new Student("300", "홍길동3"));
        hashSet.add(new Student("400", "홍길동4"));
        hashSet.add(new Student("100", "홍길동7"));

        System.out.println(hashSet);

    }
}
