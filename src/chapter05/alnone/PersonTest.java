package chapter05.alnone;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 26;
        person.name = "이동주";
        person.isMarried = false;
        person.chNum = 0;

        person.personInfo();
    }
}
