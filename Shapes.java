public abstract class Shapes {

  String name;
  double width, height;

// Constructor
public Shapes(String name, double width, double height) {
  super(name, width, height);
  this.name = name;
  this.width = width;
  this.height = height;
}

// generate getters and setters

  public String getName () {
    return = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Height

    public double getHeight () {
    return = height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  // Width

  public double getWidth () {
    return = width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  // abstract keyword allows us to declare a method and fill the body in the subclass 
  abstract double calculateArea(double width, double height); 
  abstract double calculateCircumference(double width, double height);

}