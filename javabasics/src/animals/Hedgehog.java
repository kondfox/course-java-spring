package animals;

public class Hedgehog extends Animal {

  private int quillAmount;

  public Hedgehog() {
    super(0, 0);
    quillAmount = 10;
  }

  public void collect(String food) {
    // ...
  }

  @Override
  public String toString() {
    return "Hedgehog{" +
            "id=" + getId() +
            ", age=" + getAge() +
            ", quillAmount=" + quillAmount +
            '}';
  }

}
