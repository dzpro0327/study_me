package chapter07.array.prac01;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("안녕하세요.");
        list.add("Hello.");
        list.add("HI.");

        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<10; i++) {
            sum += num[i];
        }
        System.out.println(list);
        System.out.println(sum);

    }

}
