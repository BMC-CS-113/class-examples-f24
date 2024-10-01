// Adam Poliak
// 10/01/2024
// Reucrsion with strings examples

public class Recursion {

  public static int factorial(int num) {
     System.out.printf("IN factorial, num is now %d\n",num);
     if (num == 1) {
       return num;
     }
     return num * factorial(num - 1);
     /*
     int factorialResult = factorial(num - 1);
     int result= num * factorialResult;
     return result;
    */
  }

  // if a letter appears multiple times, give us the last index of that letter
  public static int indexOf(String haystack, char needle) {
     /// base case 1: if the needle isnt there
     if (haystack.length() == 0) {
       return -1;
     }
     //base case 2: we found the needle
     if (haystack.charAt(haystack.length() -1) == needle) {
       // found it
       return haystack.length() -1;
     }
     return indexOf(haystack.substring(0, haystack.length()-1), needle);
  }

  public static boolean containsLetter(String haystack, char needle) {
     System.out.printf("Our haystack right now is %s\n", haystack);
     System.out.printf("Haystack size is %d\n", haystack.length());
    //base case of failure
    if (haystack.length() == 0) {
      System.out.println("no need in our haystack ;( look elsehwere buddy!");
      return false;
    }
     // base case of sucess
     if (haystack.charAt(0) == needle) {
       System.out.println("We found our needle");
       return true;
    }
    return containsLetter(haystack.substring(1), needle);
  }

  public static void main(String[] args) {
    System.out.println(factorial(3)); // 6
    
    //containsLetter: take in a string and char, and deterimine if the char is in the string
    //containsLetter("hello", 'a') -> false
    //containsLetter("", 'a') -> false
    containsLetter("bfgfdfgadfgfd", 'a');// -> true
    containsLetter("bfgfdfgadfgfd", 'x');// -> true
    System.out.println("abc".charAt(2));
    System.out.println(indexOf("abcd", 'd')); // 3
    System.out.println(indexOf("abcd", 'a')); // 0
    System.out.println(indexOf("abcd", 'z')); // -1
 } 

}
