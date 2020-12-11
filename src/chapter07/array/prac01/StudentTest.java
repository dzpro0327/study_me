package chapter07.array.prac01;

public class StudentTest {
    public static void main(String[] args) {
        Student[] list = new Student[3];
        list[0] = new Student(1001, "James");
        list[1] = new Student(1002,"Tomas");
        list[2] = new Student(1003, "Edward");

        for(int i=0; i<list.length; i++) {
            list[i].showInfo();
        }
    }
}
