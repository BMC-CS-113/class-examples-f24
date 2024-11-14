public class Parrot extends Animal {


  private String color;
     // value constrcutor
  public Parrot(String name, double weight, boolean liveInWater,
               boolean isAwake, String color) {
   super(name, weight, liveInWater, isAwake);
   this.color = color;
  }

  public void move() {
    System.out.println("I fly");
  }

  public void talk(String message) {
    System.out.println(message);
  }

  public String toString() {
    // how can we call the toString() method from Animal
    //String output = this.name + " weighs: " + this.weight +", isAwake: " + this.is    Awake;
    String output = super.toString(); 
    output += " color: " + color;
   return output;
  }

  public static void main(String[] args) {
    Animal blu = new Parrot("blue", 5., false, false, "blue");
    System.out.println(blu);
  }
}
