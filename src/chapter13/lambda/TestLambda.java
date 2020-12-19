package chapter13.lambda;

@FunctionalInterface
interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        // 람다식
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lambda_1");
        showMyString(lambdaStr);

    }
    public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }
}
