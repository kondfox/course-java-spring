package animals;

public class Animal {

  static int idGenerator = 1;
  static int hungerLimit = 5;

  private int id;
  private String name;
  private int age;
  private int foodAmount;

  public Animal() {
    this.name = "unknown";
    this.foodAmount = 0;
    this.id = idGenerator++;
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    this.foodAmount = 0;
    this.id = idGenerator++;
  }

  public Animal(String name, int age, int foodAmount) {
    this.name = name;
    this.age = age;
    this.foodAmount = foodAmount;
    this.id = idGenerator++;
  }

  public static int nextId() {
    return idGenerator;
  }

  public void feed(int amount) {
    this.foodAmount += amount;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > this.age) {
      this.age = age;
    }
  }

  public boolean isHungry() {
    return foodAmount < Animal.hungerLimit;
  }

  @Override
  public String toString() {
    return "animals.Animal{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", isHungry=" + isHungry() +
            '}';
  }

}
