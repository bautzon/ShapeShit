/*
*******      Requirements    ********
 Implement small shapes model.
 Must be designed Obejct oriented.
  1. Create an abstract superclass.
  2.  Return the center of the shape
    2.1 + 2.2 + 2.3 Rectangles, triangles and circles
 3. Compute the area of the shape
 4 Compute the circumference of the shape
  5. indicate whether a point is inside the shape or not.
  5. Compute through Euclidean distance to another shape.
---------------------------------------------
Future Optional behaviour is
6. Tell of one shape is inside another
7. Compute overlaps between shapesMove shapes withion a two dimensional space.
8. Move shapes within a twi dimensional space. Layout shapes without any overlaps.
*/
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
//importing jaazzz

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

//System.out.println();


class Main {
  double xOne = 10.0;
  double yOne = 10.0;
  double xTwo = 20.0;
  double yTwo = 20.0;
 

  public static void main(String[] args) {
    
    //Distance distanceObj = new Distance();
    //distanceObj.listCord();

  
    //prøver lige noget jaazzz

    //create rectangle

    //Shape s = new Rectangle2D.Double(x1,y1,x2,y2);

    // create circle

   // //Shape circle = new Ellipse2D.Double(double x, double y, double w, double h);

    //System.out.println(circle.contains(30,40));
    
   // Shape triangle = new Triangle(side1, side2, side3)
    
    // https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Ellipse2D.Double.html

    // triangle 

    
    
    //System.out.println(s.contains(30,40));
    



   System.out.println("\n \n \n ");
   double h = 10;
   double l = 15;
   double radius = 5;
   
    Circle circleObj = new Circle();
    circleObj.circleArea(radius);
    circleObj.circleCircum(radius);

    System.out.println("\n \n \n ");

    Rect rectObj = new Rect();
    rectObj.rectArea(l, h);
    rectObj.rectCircum(l, h);  

    System.out.println("\n \n \n");

    Triangles triObj = new Triangles();
    triObj.triArea(l, h);
    triObj.triCircum(l);

  }
}