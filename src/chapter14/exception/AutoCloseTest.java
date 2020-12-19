package chapter14.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseable obj = new AutoCloseable()) {
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
