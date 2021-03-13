
public class Distance extends shapes {

  public static double distanceXY(double xOne, double yOne, double xTwo, double yTwo) {
    
    double distance = Math.sqrt((xOne-xTwo)+(yOne-yTwo));
    System.out.print("The distance between the two different points is: ");


    System.out.print(distance);
    return distance;
  }
}
