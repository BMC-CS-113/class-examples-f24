public class Zoo {

  public static void main(String[] args) {
    Animal[] animals = new Animal[5];
    Cat fluffy = new Cat("fluffly", 20., true, true);
    Cat simba = new Cat("simba", 100., true, true);
    Cat mufasa = new Cat("mufasa", 100., true, true);
    Animal rafiki = new Monkey("rafiki", 30., true, true, 2);
    Parrot blue = new Parrot("blue", 5.0, false, false, " blue");

   animals[0] = fluffy;
   animals[1] = simba;
   animals[2] = mufasa;
   animals[3] = rafiki;
   animals[4] = blue;

   for(int i = 0; i < animals.length; i++) {
     if (animals[i] != null) {
       // cnat convert any animal into a Parrot, must first check
      // if the object is actually a Parrot (look below at instanceof)
       //Parrot tmp = (Parrot) animals[i];
       System.out.println(animals[i]);
       animals[i].move();
       animals[i].sleep();

       // only want Parrots to talk
       if (animals[i] instanceof Parrot) {
           System.out.println(i);
           // we need to figure out how to convert animals[i]
          //frlm a Animal to a Parrot
          // Type casting to the rescue!
          double a = 10.5;
          System.out.println((int) a);
          Parrot tmpParrot = (Parrot) animals[i];
          tmpParrot.talk("I am blue, thank you for making me a Parrot again");
          //animals[i].talk();
       }
    }
   }

  }

}
