import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Az OOP 4 fő alapelve:
  // ✅encapsulation, egységbe zárás
  // ✅inheritance, öröklődés
  // - polymorphism, több alakúság
  // - abstraction, absztrakció

  public static void main(String[] args) {
    Animal hedgehog = new Animal();
    Dog dog = new Dog("Fürkész", 7, 6);
    Cat cat = new Cat("Cirmi", 2);
    dog.setAge(8);
    dog.feed(2);

    System.out.println(dog);
    System.out.println(cat);
    System.out.println(hedgehog);

//    cat.feed();

    List<Animal> animals = new ArrayList<>();
    animals.add(hedgehog);
    animals.add(dog);
    animals.add(cat);

    System.out.println(animals);
    hedgehog.feed(8);
    System.out.println(animals);
  }

}