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
//System.out.println();


class Main {
  public static void main(String[] args) {
   System.out.println("\n \n \n ");






   
   double h = 10;
   double l = 15;
   double radius = 5;
   
    Circle circleObj = new Circle();
    circleObj.circleArea(radius);
    circleObj.circleCircumference(radius);

    System.out.println("\n \n \n ");

    Rect rectObj = new Rect();
    rectObj.rectArea(l, h);
    rectObj.rectCircum(l, h);  

    System.out.println("\n \n \n");

    Triangles TriObj = new Triangles();
    TriObj.TriArea(l, h);
    TriObj.TriCircum(l);

  }
}