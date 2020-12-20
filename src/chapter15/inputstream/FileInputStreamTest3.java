package chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            byte[] bytes = new byte[10];
            int i;
            while ((i = fis.read(bytes)) != -1) {
                for (int k = 0; k < i; k++) {
                    System.out.println((char) bytes[k]);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
