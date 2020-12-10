package chapter06.singleton;

public class Company {
    // 2. static(전역)으로 유일한 인스턴스 생성
    private static Company instance = new Company();

    // 1. 생성자 접근을 힘들게 만든다.
    private Company() {
    }

    // 3. 외부에서 참조할 수 있게 public 메서드 만들기
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
