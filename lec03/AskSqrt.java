// Adam Poliak
// 09/12/2024
// Get number from a user, print sqrt
// bad example here where we copy and paste lots of code

import java.util.Scanner;

public class AskSqrt {


  public static void main(String[] args) {
     // ask user for a number
     System.out.println("give me your fav number fool: ");
    // store the number
    Scanner sc = new Scanner(System.in);
   int numb = sc.nextInt();
   System.out.println(numb);
   // sqrt the number
   System.out.printf("%d\n",Math.round(Math.sqrt(numb)));

     System.out.println("give me your fav number fool: ");
    // store the number
    numb = sc.nextInt();
   System.out.println(numb);
   // sqrt the number
   System.out.printf("the sqrt is: %\n",Math.round(Math.sqrt(numb)));

     System.out.println("give me your fav number fool: ");
    // store the number
    numb = sc.nextInt();
   System.out.println(numb);
   // sqrt the number
   System.out.printf("%d\n",Math.round(Math.sqrt(numb)));
     System.out.println("give me your fav number fool: ");
    // store the number
    numb = sc.nextInt();
   System.out.println(numb);
   // sqrt the number
   System.out.printf("%d\n",Math.round(Math.sqrt(numb)));
  }


} 
