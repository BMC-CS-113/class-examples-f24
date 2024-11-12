public class Zoo {

  public static void main(String[] args) {
    Animal[] animals = new Animal[5];
    Cat fluffy = new Cat("fluffly", 20., true, true);
    Cat simba = new Cat("simba", 100., true, true);
    Cat mufasa = new Cat("mufasa", 100., true, true);
    Monkey rafiki = new Monkey("rafiki", 30., true, true, 2);

   animals[0] = fluffy;
   animals[1] = simba;
   animals[2] = mufasa;
   animals[3] = rafiki;

   for(int i = 0; i < animals.length; i++) {
     if (animals[i] != null) {
       System.out.println(animals[i]);
       animals[i].sleep();
       animals[i].move();
    }
   }

  }

}
