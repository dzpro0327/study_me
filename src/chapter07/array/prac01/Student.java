package chapter07.array.prac01;

public class Student {
    private int studentID;
    private String name;

    public Student() {
    }

    public Student(int studentID, String name) {
        this.name = name;
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("학생 아이디:" + studentID + " 학생 이름:" + name);
    }
}
