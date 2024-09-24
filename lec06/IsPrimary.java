// Adam Poliak
// 09/24/2024
// Checking if the user's color is primary


import java.util.Scanner;

public class IsPrimary {

  public static void main(String[] args) { 

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a color: ");

     String color = sc.nextLine();

    /*
     if color is blue:
      do something
    else if color is red:
     do something
    else if color is yellow
     do something
    else:
     not pritmary
   */
 
     if (color.compareTo("blue") == 0 ||
         color.compareTo("red") == 0 ||
         color.compareTo("yellow") == 0) {
         System.out.printf("%s is primary\n", color);
     }
     else {
         System.out.printf("%s is not primary\n", color);
     }
  }

}
