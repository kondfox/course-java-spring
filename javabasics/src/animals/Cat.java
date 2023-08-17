package animals;

public class Cat extends Animal {

  private String name;

  public Cat(String name, int age) {
    super(age, 0);
    this.name = name;
  }

  public void catchingMouse() {
    // ...
  }

  @Override
  public void speak() {
    System.out.println("miau");
  }

}
