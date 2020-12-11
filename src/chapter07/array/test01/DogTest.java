package chapter07.array.test01;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        dogs.get(0).setName("멍1");
        dogs.get(0).setType("왈1");
        dogs.get(1).setName("왈2");
        dogs.get(1).setType("왈2");
        dogs.get(2).setName("왈3");
        dogs.get(2).setType("왈3");
        dogs.get(3).setName("왈4");
        dogs.get(3).setType("왈4");
        dogs.get(4).setName("왈5");
        dogs.get(4).setType("왈5");

        for(Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
