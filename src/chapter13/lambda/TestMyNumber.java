package chapter13.lambda;

public class TestMyNumber{
    public static void main(String[] args) {
        // 간단하게
        MyNumber max = (x, y) -> (x >= y) ? x : y;
        // 람다식 사용
        MyNumber max2 = (x, y) -> {
            if (x >= y) {
                return x;
            } else {
                return y;
            }
        };

        System.out.println(max.getMax(10, 20));
        System.out.println(max2.getMax(20, 30));
    }
}
