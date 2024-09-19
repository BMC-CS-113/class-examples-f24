//Adam Poliak
// 09/19/2024
// Scope error - compile this code, line 20 will results in an error

public class Area {

  /**
    Computes the area of a rectangle
    @param double - the height
    @param double - the length
    @return the area as a double
  */
  public static double recArea(double height, double weight) {
    double area = height * weight;
    return area;
  }
 
  public static void main(String[] args) {
    double size = recArea(10., 5);
    System.out.println(height * 5);
    System.out.printf("The area is %.2f\n", size);    

  }

}
