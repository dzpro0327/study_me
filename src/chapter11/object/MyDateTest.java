package chapter11.object;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {  // 1. 형 변환이 가능한가?
            MyDate myDate = (MyDate) obj;
            // 2. 인스턴스 값이 같은가??
            if (this.day == myDate.day && this.month == myDate.month && this.year == myDate.year) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day & month & year;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(15, 12, 2020);
        MyDate myDate2 = new MyDate(15, 12, 2020);
        System.out.println(myDate1.equals(myDate2));

        System.out.println("=========================================");
        System.out.println("=========================================");
        System.out.println("=========================================");

        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());

        System.out.println("=========================================");
        System.out.println("=========================================");
        System.out.println("=========================================");

        System.out.println(System.identityHashCode(myDate1));
        System.out.println(System.identityHashCode(myDate2));

    }
}
