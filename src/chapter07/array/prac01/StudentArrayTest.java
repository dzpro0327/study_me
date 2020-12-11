package chapter07.array.prac01;

import java.util.ArrayList;

public class StudentArrayTest {
    public static void main(String[] args) {
        
        // 배열 선언 
        ArrayList<Student> list = new ArrayList<>();
        
        // 배열에 요소 추가시키기
        list.add(new Student(1001, "james"));
        list.add(new Student(1002, "Tomas"));
        list.add(new Student(1003, "Edward"));

        // 향상된 for 문
        for(Student student : list) {
            student.showInfo();
        }
    }
}
