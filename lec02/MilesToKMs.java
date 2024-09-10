//Adam Poliak
// 09/10/204
// COnvert miles (userInput) to KMs)

// this is a comment, and not java code

public class MilesToKMs {

  public static void main(String[] args) {
    // dStep 1:
//   Ask a user for miles
    System.out.println("How many miles do you wanna convert?");

// Step 2: let user input the miles
// Step 3: read the users input
// Step 4: store the input (java speak: declar and assign variable)
   String userMilesString = System.console().readLine();
   System.out.println(userMilesString);
   double miles = Double.parseDouble(userMilesString);
// Step 5: Convert the miles to kilomteres
   double kms = miles * 1.6;

// Step 6: Print the result
   System.out.println(kms);

  }

}
