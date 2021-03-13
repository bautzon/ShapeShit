public class Triangles extends Shapes {
  public static double triArea(double h, double l){
    double triArea = (l * h)/2;
    System.out.print("The area of the triangle is: ");
    System.out.print(triArea);
    return triArea;
  }
  public static double triCircum(double l){
    double triCircumference = l + l + l;
    System.out.println("The Circumference of the triangle is: ");
    System.out.print(triCircumference);
    return triCircumference;
  }
  
}


/*
https://stackoverflow.com/questions/44339524/calculate-triangle-perimeter-and-circles-circumference-using-methods 

 METHOD TO SCAN 6 COORDINATES OF TRIANGLE  
  private Point p1, p2,p3;
  public int trianglePrompt(int x1, int y1, int x2, int y2, int x3, int y3)
  {
  //double x1;
  Scanner scanObject = new Scanner(System.in);
  System.out.println("Input x1 of a Triangle : ");
  x1= scanObject.nextInt();

 System.out.println("Input x1 of a Triangle : ");
  x2= scanObject.nextInt();

 System.out.println("Input x1 of a Triangle : ");
  x3= scanObject.nextInt();

 System.out.println("Input x1 of a Triangle : ");
  y1= scanObject.nextInt();

 System.out.println("Input x1 of a Triangle : ");
  y2= scanObject.nextInt();

 System.out.println("Input x1 of a Triangle : ");
  y3= scanObject.nextInt();
  //return x1;

 }
    p1 = new Point(x1,y1);
    p2 = new Point(x2,y2);
    p3 = new Point(x3,y3);
   public double getSideA()
   {
      double length = p1.distance(p2);
      return length;
   } 

   public double getSideB()
   {
     double length = p2.distance(p3);
     return length;
   }

   public double getSideC()
      {
      double length = p3.distance(p1);
      return length;
      }

//METHOD TO CALCULATE PERIMETRE OF TRIANGLE BY ADDING ALL THREE SIDES
    public int getPerimeter()
    {
    int as = getSideA(), bs = getSideB(), cs = getSideC();
    return (as + bs + cs); 
    }
}
*/ 