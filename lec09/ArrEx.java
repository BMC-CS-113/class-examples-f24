// Adam Poliak
// 10/08/2024
// Lecture 09 - recursion with arrays

public class ArrEx {


  // this is called a helper method
  public static void printList(String[] str, int currLocation) {
     // base case: how do we know we dont need to print anymore
     // answer: when we get to the end of the array
     if (str.length == currLocation) {
       // stop making recursive calls, get out, go home, theres nothing good about to happen
       return;
     }

     // rule
     // excersize to the reader: can you make sure the last print doesnt include a ,
     System.out.printf("%s, ", str[currLocation]);
     // recursive  call
     printList(str, currLocation + 1);
  }

  // simple problem is print one item in the list, punt the rest down
  public static void printList(String[] str) {
     int currLocation = 0
     printList(str, currLocation);
     System.out.printf("currLocation is 24 is: %d\n", currLocation);
     /*
     // perform some operation at the beginig or end of the string
     // here the operation we want to perform is print the item in trhe begining of the list
     System.out.printf("%s, ", str[0]);

     // make a recursrive call
     // what did we do before making our recursive call in string problem
     // Answer: we shrunk our search space, i.e. we made the string shorter by removing
    // the character we just considered. In java syntax: using substring
     printList(str);
     */
  }


  public static void add1(int[] list, int pos) {
    if (pos >= list.length) {
      return;
    }
    list[pos] += 1;
    add1(list, pos+1);
  }

  public static void main(String[] args) {

    int[] numbers = new int[3];
    System.out.println(numbers);
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    // this leads to an inbdexo out of bounds error
    //System.out.println(numbers[3]);
    //System.out.println(numbers[-1]);

   String[] strings = {"I", "love", "cs113"};
   System.out.println(strings);
   printList(strings);
  
   System.out.printf("THere are %d command line arguments \n", args.length);
   /* this hard coding is bad - why? makes too assumptions
   System.out.println(args[0]);
   System.out.println(args[1]);
   System.out.println(args[2]);
   */

  // what can we do to print out all the command line arguents,r egardless of how many the user puts in when
  // running this program
  //System.out.println(args);
  printList(args);

  double[] dubs = new double[2];
  System.out.println(dubs[0]);


  String[] str = new String[3];
  // error because of null object
  //System.out.println(str[2].length());

  // These are different arrays
  int[] a = {1,2,3};
  int[] b = {1,2,3};
  System.out.println(a == b);
  System.out.println(a);
  System.out.println(b);


  //add1(a, 0);
  //printList(add1);
  }

}
