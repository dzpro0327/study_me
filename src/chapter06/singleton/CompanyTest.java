package chapter06.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        // 4. 실제로 사용하는 코드 만들기
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();
        System.out.println(myCompany1 == myCompany2);

    }
}
