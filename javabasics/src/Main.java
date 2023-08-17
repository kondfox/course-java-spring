import java.util.ArrayList;
import java.util.List;

public class Main {

  // Az OOP 4 fő alapelve:
  // - encapsulation, egységbe zárás
  // - inheritance, öröklődés
  // - polymorphism, több alakúság
  // - abstraction, absztrakció

  public static void main(String[] args) {
    Animal hedgehog = new Animal();
    Animal dog = new Animal("Fürkész", 7, false);
    Animal cat = new Animal("Cirmi", 2);

//    cat.feed();

    List<Animal> animals = new ArrayList<>();
    animals.add(hedgehog);
    animals.add(dog);
    animals.add(cat);

    System.out.println(animals);
    System.out.println(Animal.nextId());
  }

}