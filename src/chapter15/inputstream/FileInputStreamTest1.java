package chapter15.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        // 파일에서 자료를 읽어 들이는 스트림 클래스중 최상위 클래스
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("example.txt");
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fis.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
