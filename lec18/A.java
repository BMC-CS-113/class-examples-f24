public class A {

  //every class implicitly has
  // an empty consturctor

  public static void main(String[] args) {
    A a = new A();
    //a.foo();
   A a1 = new A();
   System.out.println(a == a1);
   // QUestion: whyt is there no compile error here,
   // we never define a method named equals? What is going on? wtf
   // Answer all classes implicitly extend the Object class,
   // which has a equals method
   System.out.println(a.equals(a1));
  }

}
