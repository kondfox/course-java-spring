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

}
