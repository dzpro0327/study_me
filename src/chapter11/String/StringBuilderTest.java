package chapter11.String;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
        System.out.println("===============================================================");

        StringBuilder builder = new StringBuilder(javaStr);
        System.out.println("builder 문자열 주소 : " + System.identityHashCode(builder));
        System.out.println("===============================================================");

        builder.append(" and");
        builder.append(" android");
        builder.append(" programming is fun!!");
        System.out.println(System.identityHashCode(builder));
        System.out.println("===============================================================");

        javaStr = builder.toString();
        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr));


    }
}
