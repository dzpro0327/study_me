package chapter11.object;

class Student {
    int studentID;
    String name;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "학생의 이름: " + name + " 학생의 학번: " + studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentID == std.studentID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}


public class StudnetTest {
    public static void main(String[] args) {
        Student student1 = new Student("이동주", 1001);
        Student student3 = student1;   // student3은 student1과 주소값과 인스턴스 값이 같다
        Student student2 = new Student("이동주", 1001);
        System.out.println(student1.toString());

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("==================================");

        System.out.println(student1 == student2);
        System.out.println(student2.equals(student3));
        System.out.println(student1.equals(student2));

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("==================================");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println();

        System.out.println("실제 주소값");
        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));

        // student1과 studnet2는 논리적으로는 같은 인스턴스지만 실제 주소값은 다르다.



    }
}
