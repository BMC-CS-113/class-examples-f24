public class Monkey extends Animal {


  private int tailLength;
     // value constrcutor
  public Monkey(String name, double weight, boolean liveInWater,
               boolean isAwake, int tailLength) {
    /*this.name = name;
    this.weight = weight;
    this.liveInWater = liveInWater;
    this.isAwake = isAwake;*/
    // this calls the empty constructor
   //super();
   super(name, weight, liveInWater, isAwake);
   this.tailLength = tailLength;
  }

  public void move() {
    System.out.println("I climb");
  }

  public String toString() {
    // how can we call the toString() method from Animal
   return "";
  }

}
