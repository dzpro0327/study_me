package chapter06.prac02;

public class StudentTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        System.out.println("학번 " + student1.getStudentID());
        System.out.println("카드번호 " + student1.getSerialCardNum());

        Student1 student2 = new Student1();
        System.out.println("학번 " + student2.getStudentID());
        System.out.println("카드번호 " + student2.getSerialCardNum());

    }
}
