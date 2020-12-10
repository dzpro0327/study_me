package chapter06.prac01;

public class StudnetTest {
    public static void main(String[] args) {
        // 학생 인스턴스 생성
        Student student = new Student("이동주", 10000);

        // 버스 인스턴스 생성
        Bus bus = new Bus(1001);
        // 학생이 서비스를 이욯할 때의 정보
        student.takeBus(bus);
        bus.showInfo();

        // 지하철 인스턴스 생성
        Subway subway = new Subway(2);
        // 학생이 서비스를 이욯할 때의 정보
        student.takeSubway(subway);
        subway.showInfo();

        // 택시 인스턴스 생성
        Taxi taxi = new Taxi(1234);
        // 학생이 서비스를 이욯할 때의 정보
        student.takeTaxi(taxi);
        taxi.showInfo();
        
        // 학생의  총지출 정보
        student.studentInfo();
    }
}
