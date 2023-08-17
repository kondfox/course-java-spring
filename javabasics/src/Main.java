import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Az OOP 4 fő alapelve:
  // ✅encapsulation, egységbe zárás
  // - inheritance, öröklődés
  // - polymorphism, több alakúság
  // - abstraction, absztrakció

  public static void main(String[] args) {
    Animal hedgehog = new Animal();
    Animal dog = new Animal("Fürkész", 7, 6);
    Animal cat = new Animal("Cirmi", 2);
    dog.setAge(8);

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