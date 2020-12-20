package chapter15.decorator;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
