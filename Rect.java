class Rect extends Shapes{
  
  public double rectArea(double h, double l){
    double rectAreal = l * h;
    System.out.print("The area of the rectangle is: ");
    System.out.print(rectAreal);
    return rectAreal;
  }

  public double rectCircum(double h, double l){
  double rectCircumference = 2*(l+h);
  System.out.println("The circumference of the rectangle is: ");
  System.out.print(rectCircumference);
  return rectCircumference;
  }
}