package chapter05;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("본인이 원하는 사칙연산 기호를 입력하세요. ex) +, -, /, X");

        String math = scanner.nextLine();

        System.out.println("두 값을 입력해 주세요. 단! 1)첫번째 값을 입력하고 띄우고 다음값 입력해 주세요." +
                " 2)나누기는 먼저입력하는 숫자를 크게 해주세요.");
        System.out.println("나누기 입력 숫자 예시)  10.0 20.0");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();

        switch (math) {
            case "+":
                add(number1, number2);
                break;

            case "-":
                minus(number1, number2);
                break;

            case "/":
                div(number3, number4);
                break;

            case "X":
                mul(number1, number2);
                break;

        }
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void div(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("처음부터 다시입력하세요.");
            return;
        }
        System.out.println(( num1 / num2));
    }


}
