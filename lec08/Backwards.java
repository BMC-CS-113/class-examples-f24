// Adam Poliak
// 10/01/2024
// First time seeing arrays

import java.util.Scanner;


public class Backwards {

  public static void main(String[] args) {

    int[] numbers = new int[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number");
    numbers[0] = sc.nextInt();
    System.out.println("Give me a number");
    numbers[1] = sc.nextInt();
    System.out.println("Give me a number");
    numbers[2] = sc.nextInt();
    System.out.printf("%d, %d, %d\n", numbers[2], numbers[1], numbers[0]);
  }

}
