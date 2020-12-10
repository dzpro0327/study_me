package chapter05;

import java.util.Calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 29) {
                System.out.println("유효하지 않은 날짜입니다.");
            }
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        Calendar calendar = Calendar.getInstance();
        if (day == calendar.get(day)) {
            if (month == calendar.get(month)) {
                if (year == calendar.get(year)) {
                    System.out.println("유효한 날짜입니다.");
                }
            }
        }
        System.out.println("유효하지 않은 날짜입니다.");
        return false;
    }
}
