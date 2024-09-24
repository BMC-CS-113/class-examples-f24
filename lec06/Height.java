// Adam Poliak
// 09/24/24
// if else if else example

class Height {
  public static void main(String[] args) {
    System.out.print("Enter a height (inches): ");
    int h = Integer.parseInt(System.console().readLine());

    if (h > 60) {
      System.out.println("Taller than 5 ft");
    }
    else if (h > 48) {
      System.out.println("Taller than 4 ft");
    }
    // this creates a new multi-way conditional check
    if (h > 36) { //was else if
      System.out.println("Taller than 3 ft");
    }
    else {
      System.out.println("Too small for this ride");
    }
  }
}

