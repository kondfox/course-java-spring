package others;

public class Farmer implements Hungry {

  @Override
  public boolean isHungry() {
    return false;
  }

  @Override
  public void feed(int amount) {
    // ...
  }

}
