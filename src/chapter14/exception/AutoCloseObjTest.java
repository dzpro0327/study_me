package chapter14.exception;

public class AutoCloseObjTest {
    public static void main(String[] args) {
        try(AutoCloseable obj = new AutoCloseable()) {
            throw new Exception();  // 강제 예외발생
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
