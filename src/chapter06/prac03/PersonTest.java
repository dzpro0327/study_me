package chapter06.prac03;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person("김 씨", 10000);
        Person personLee = new Person("이 씨", 10000);

        StarCafe starCafe = new StarCafe("아메리카노");
        personKim.takeStarCoffee(starCafe);
        personKim.personInfo();
        starCafe.showInfo();

        KongCafe kongCafe = new KongCafe("라테");
        personLee.takeKongCoffee(kongCafe);
        personLee.personInfo();
        kongCafe.showInfo();
    }
}
