package chapter15.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output3.txt");

        try (fos) {
            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data;
                data++;
            }
            // 2번 ~ 10번 까지만 출력
            fos.write(bytes, 2, 10);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
