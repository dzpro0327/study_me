package chapter07.array.test;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1001, "LEE");
        student.addSubject("국어", 100);
        student.addSubject("수학", 50);
        student.showInfo();

        System.out.println("======================================");
        System.out.println("======================================");

        Student student1 = new Student(1002, "KIM");
        student1.addSubject("국어",75);
        student1.addSubject("수학",85);
        student1.addSubject("영어",100);
        student1.showInfo();

    }
}
