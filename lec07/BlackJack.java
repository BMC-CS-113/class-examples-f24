// Adam Poliak
// lecture 07
// black jack using recursion

public class BlackJack {
  public static int drawCard() {
    double randomDouble = Math.random();
    int newCardValue = 1+ (int) (randomDouble * 11);
    return newCardValue;

  }

  public static void checkValue(int hand) {
    System.out.printf("Your hand is %d\n", hand);
    if (hand > 21) {
      System.out.println("You lose! Thanks for your money!");
      return;
    } else if (hand == 21) {
      System.out.println("congrats!");
      return;
    }else if (hand > 17) {
      System.out.println("stay!");
      return;
    }
    // 2.3.2 and 2.3.3
    hand += drawCard();
    // 2.3.4
    checkValue(hand);
  }
  
  public static void main(String[] args) {
   /**
   
1. Create a hand: 
   1.1 Generate the first card
   1.2 Update the value of the hand
   1.3 Generate the second card
   1.4 Update the value of the hand
   */ 
   int hand = drawCard();
   //hand += drawCard();
   hand = hand + drawCard();

   /*
2. Check the value of the current hand:
   */
   checkValue(hand); 
   /*
  2.1 if currentHandValue > 21:
    2.1.1 print losing message 
    2.1.2 and end
  2.2 if currentHandValue > 16:
    2.2.1 print stand and end
  2.3 otherwise:
    2.3.1 print hit
    2.3.2 generate another card
    2.3.3 updae teh value of the current hand
    2.3.4 go back to 2
  */
  }

}
