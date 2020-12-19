package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        
        // 객체지향 StringConcatlmpl 있어야 함
        StringConcatlmpl concat1 = new StringConcatlmpl();
        concat1.strConcat(s1, s2);

        // 람다
        StringConcat concat2 = (x, y) -> {
            System.out.println(x + " , " + y);
        };
        concat2.strConcat(s1, s2);
    }


}
