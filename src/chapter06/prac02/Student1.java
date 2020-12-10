package chapter06.prac02;

public class Student1 {
    private static int serialNum = 1000;
    private int serialCardNum;
    private int studentID;
    private String studentName;
    private int grade;
    private String address;

    public Student1(){
        // 학생 학번
        serialNum++;
        studentID = serialNum;

        // 학생 카드번호
        serialCardNum = studentID + 100;

    }


    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student1.serialNum = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSerialCardNum() {
        return serialCardNum;
    }

    public void setSerialCardNum(int serialCardNum) {
        this.serialCardNum = serialCardNum;
    }

}
