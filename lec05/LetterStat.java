// Adam Poliak
// 09/19/2024
// Method for computing the dsistance between a char and a

public class LetterStat {

  /**
    Computes how far away a letter is from a
    @param char - the letter to consideer
    @return int - the distance from letter to a
  */
  public static int distanceFromA(char letter) {
     /*
       
    */
    int difference = letter - 'A';
    return difference;
  }

  //interactive verion
  public static int distanceFromA() { 
    System.out.print("Give me a character: ");
    String input = System.console().readLine();
    char first = input.charAt(0);
    return distanceFromA(first);
    // int difference = first - 'a';
    // return difference;
  } 

  public static void main(String[] args) {
    /*
    System.out.printf("The value of a as an int is %d\n", (int) 'a');
    System.out.printf("The value of a as an int is %d\n", (int) 'b');
    System.out.printf("The distance is: %d\n", 'b' - 'a');
    */
    System.out.println(distanceFromA('a')); // should return 0
    System.out.println(distanceFromA('z')); // should return 25
    System.out.println(distanceFromA('h')); // should return 7

     // example of same method name, different arugments
     System.out.println(1);
     System.out.println("hello");

     System.out.println(distanceFromA());

  }

}
