package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
          // 예외처리 최상위 클래스 Exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
