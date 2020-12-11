package chapter07.array.test;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjects;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<>(); // 생성자 안에 배열을 생성
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();   // 인스턴스 생성
        subject.setSubName(name);   // 이름 입력
        subject.setScore(score);    // 점수 입력
        subjects.add(subject);      // 배열에 붙여 넣기
    }

    public void showInfo() {
        int total=0;
        for(Subject s : subjects) {
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getSubName() + "과목 성적은" + s.getScore() +
                    "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
