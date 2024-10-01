// Adam Poliak
// lecture 07
// Printing a message using recursion

public class Message {

  public static void hello(int remainingPrints) {
    if (remainingPrints == 0)
     return;
    System.out.println("Hello");
    hello(remainingPrints - 1);
   }


  public static void main(String[] args) {
   hello(5);
  }

}
