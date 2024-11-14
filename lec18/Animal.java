public class Animal {

  // what do animals have?
  /*
  brain, eyes, heart
 */
  protected String name;
  protected double weight;
  protected boolean liveInWater;
  protected boolean isAwake;
  protected boolean isCarnivor = true;

  // empty constructor
  public Animal(){
    name = "";
    weight = 0.;
    liveInWater = false;
    isAwake = false;
  }

  // value constrcutor
  public Animal(String name, double weight, boolean liveInWater,
               boolean isAwake) {
    this.name = name;
    this.weight = weight;
    this.liveInWater = liveInWater;
    this.isAwake = isAwake;
  }
  

  // what do animals do?
  /* eat, sleep, move*/
  public void sleep() {
    isAwake = false;
  }
  public void wakeUp() {
    isAwake = true;
  }

  public double eat(Animal prey) {
    if (!this.isAwake) {
       return -1.0;
    }
    this.weight += prey.weight;
    prey.sleep();
    prey.weight = -1.;
    return this.weight;
  }

  public void move() {
    System.out.println("I move!");
  }

  public String toString() {
    String output = this.name + " weighs: " + this.weight +", isAwake: " + this.isAwake; 
    return output;
  }

  public boolean equal(Animal other) {
    //System.out.println("Names are the same: " + this.name.equals(other.name));
    return this.name.equals(other.name) && 
          this.weight == other.weight && 
          this.isAwake == other.isAwake &&
          this.liveInWater == other.liveInWater;
  }

  public static void main(String[] args) { 
     Animal a1 = new Animal("adam's dog", 50., false, true);
     System.out.println(a1);
     Animal a2 = new Animal("adam's dog", 50., false, true);
     // are a1 & a2 the same?
     System.out.println(a1 == a2); //
     System.out.println(a1.equals(a2)); //

     a1.eat(a2); 
     System.out.println(a1);
     System.out.println(a2);
     System.out.println(a1.equals(a2)); //
  }

}
