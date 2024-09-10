// Adam Poliak
// 09/10/2024
// Ask a user for their name

public class Ask {

  public static void main(String[] args) {
    System.out.println("Whats your name?");

   String name = System.console().readLine();

   System.out.println(name + " welcome to cs113!");
  }
}
