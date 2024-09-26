public class BlackJack {
  public int drawCard() {
    double randomDouble = Math.random();
    int newCardValue = 1+ (int) (randomDouble * 11);
    return newCardValue;

  }

  public static void main(String[] args) {
  }

}
