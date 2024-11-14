public class Cat extends Animal {

     public Cat(String name, double weight, boolean liveInWater,
               boolean isAwake) {
    this.name = name;
    this.weight = weight;
    this.liveInWater = liveInWater;
    this.isAwake = isAwake;
  }

  public void move() {
   System.out.println("I stealthfully walk");
  }

   public static void main(String[] args) {

     Cat fluffy = new Cat("fluffy", 20., true, false);
     System.out.println(fluffy);
     Cat fluffy1 = new Cat("fluffy", 20., true, false);
     System.out.println(fluffy1.equals(fluffy));
     fluffy.move();
   }

}
