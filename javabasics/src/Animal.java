public class Animal {

  static int idGenerator = 1;

  int id;
  String name;
  int age;
  boolean isHungry;

  public Animal() {
    this.name = "unknown";
    this.isHungry = true;
    this.id = idGenerator++;
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    this.isHungry = true;
    this.id = idGenerator++;
  }

  public Animal(String name, int age, boolean isHungry) {
    this.name = name;
    this.age = age;
    this.isHungry = isHungry;
    this.id = idGenerator++;
  }

  public static int nextId() {
    return idGenerator;
  }

  public void feed() {
    isHungry = false;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", isHungry=" + isHungry +
            '}';
  }

}
