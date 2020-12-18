package chapter12.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        // 순서에 상관없이 중복을 허용하지 않는다.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("이동주1"));
        hashSet.add(new String("이동주2"));
        hashSet.add(new String("이동주2"));
        hashSet.add(new String("이동주4"));
        hashSet.add(new String("이동주5"));

        System.out.println(hashSet);
    }
}
