package animals;

public class Dog extends Animal {

  private String name;

  public Dog(String name, int age, int foodAmount) {
    super(age, foodAmount);
    this.name = name;
  }

}
