
public class Circle extends shapes {

  public double circleArea(double radius) {
    double Circle_a = Math.PI * (radius * radius);
    System.out.print("The area of the circle is: ");
    System.out.println(Circle_a);
    return Circle_a;
  }

  public double circleCircumference(double radius) {
    double circle_circumference = Math.PI * (radius * 2);
    System.out.print("The circumference of the circle is: ");
    System.out.print(circle_circumference);
    return circle_circumference;
  }
}