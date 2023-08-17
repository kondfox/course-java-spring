package animals;

public class Animal {

  static int idGenerator = 1;
  static int hungerLimit = 5;

  protected int id;
  private int age;
  private int foodAmount;

  public Animal() {
    this.foodAmount = 0;
    this.id = idGenerator++;
  }

  public Animal(int age) {
    this.age = age;
    this.foodAmount = 0;
    this.id = idGenerator++;
  }

  public Animal(int age, int foodAmount) {
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
            ", age=" + age +
            ", isHungry=" + isHungry() +
            '}';
  }

}
