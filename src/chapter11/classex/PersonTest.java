package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Class pClass1 = person.getClass();
        // 클래스 이름
        System.out.println("클래스 이름 " + pClass1.getName());

        // 클래스 생성자
        Constructor[] constructors = pClass1.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("클래스 생성자 " + c);
        }

        // 클래스 메서드
        Method[] methods = pClass1.getMethods();
        for (Method m : methods) {
            System.out.println("클래스 메서드 " + m);
        }

        // 클래스 필드 public만 보임
        Field[] fields = pClass1.getFields();
        for (Field f : fields) {
            System.out.println("클래스 필드 " + f);
        }
    }
}
