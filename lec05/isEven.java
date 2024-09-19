// Adam Poliak
// 09/19/2024
// Determine if a number is even or odd

import java.util.Scanner;

public class isEven {
 
   public static void isEven() {
     //ask a user for an int

     System.out.println("Please enter an integer: ");
     // read in the user's input
     //store the integer
     Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     //check if integer is even
      boolean isEven = input % 2 == 0;
      if (isEven) {
        System.out.println("Even!");
      }
     else {
       System.out.println("Odd");
     }
     // prints out that the numeber is even if it is, otherwise print odd

    //
   }

  public static void main(String[] args) {

    isEven();
  }

}
