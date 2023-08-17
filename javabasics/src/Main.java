import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Hedgehog;
import others.Hungry;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Az OOP 4 fő alapelve:
  // ✅encapsulation, egységbe zárás
  // ✅inheritance, öröklődés
  // ✅polymorphism, több alakúság
  //    - compile time polymorphism
  //    - runtime polymorphism
  // ✅abstraction, absztrakció

  public static void main(String[] args) {
    Hedgehog hedgehog = new Hedgehog();
    Animal dog = new Dog("Fürkész", 7, 6);
    Animal cat = new Cat("Cirmi", 2);
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

    List<Object> objects = new ArrayList<>();
    objects.add(1);
    objects.add("asdas");
    objects.add(dog);

    for (Animal animal : animals) {
      animal.speak();
    }
  }

}