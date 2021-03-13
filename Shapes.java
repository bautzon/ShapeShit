public abstract class Shapes {

  String name;
  double width, height;

  // abstract keyword allows us to declare a method and fill the body in the subclass 
  abstract double calculateArea(double width, double height); 
  abstract double calculateCircumference(double width, double height);

}