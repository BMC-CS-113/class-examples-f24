// Adam Poliak
// 09/12/2024
// Using scanner class

import java.util.Scanner;

public class ScannerEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("WHats your name? ");
    String name =  sc.nextLine();

   System.out.println("WHats your age?");
   //int age = sc.nextInt();
   double age = sc.nextDouble();

  System.out.println("Hello " + name + ", you are " + age + " yrs old");
  System.out.printf("Hello %s, you are %f years old\n", name, age);

  
  }

}
