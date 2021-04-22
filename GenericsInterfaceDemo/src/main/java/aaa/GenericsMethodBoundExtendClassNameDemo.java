
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC Của Tú
 */
abstract class Animal {

    String name;

    public void checkup() {
        System.out.println("Animal checkup");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    public void checkup() {
        System.out.println(name + "Dog checkup");
    }
}

class Cat extends Animal {

    Cat(String name) {
        this.name = name;
    }

    public void checkup() {
        System.out.println(name + "Cat checkup");
    }
}

class AnimalDoctor {

    public void checkupAll(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.checkup();
        }
    }

    public <T extends Animal> void checkupAll2(List<T> animals) {
        for (Animal a : animals) {
            a.checkup();
        }
    }
}

public class GenericsMethodBoundExtendClassNameDemo {

    public static void main(String[] args) {
        AnimalDoctor doctor = new AnimalDoctor();
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Tom"));
        cats.add(new Cat("Mew"));
        cats.get(0).checkup();
        cats.get(1).checkup();

        System.out.println("Using checkup All");
        doctor.checkupAll(cats);
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Pluto"));
        dogs.add(new Dog("Mupphin"));

        System.out.println("-------");
        dogs.get(0).checkup();
        dogs.get(1).checkup();
        System.out.println("Using checkup All");

        doctor.checkupAll(dogs);

        System.out.println("------------");

        System.out.println("Using checkupAll2");

        dogs.add(new Dog("Special"));
        doctor.checkupAll2(dogs);

    }
}
