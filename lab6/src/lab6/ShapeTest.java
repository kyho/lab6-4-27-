package lab6;

import java.util.ArrayList;

public class ShapeTest {

   public static void main(String[] args) {
      ShapeTest shapetest = new ShapeTest();
      shapetest.start();
   }

   public void start(){
     
	      ArrayList<Shape> arraylist = new ArrayList<Shape>();
	      
	      Rectangle rectangle = new Rectangle(8,5);
	      Circle circle = new Circle(3);
	      Triangle triangle = new Triangle(2,3,4);
	      
	      arraylist.add(rectangle);
	      arraylist.add(circle);
	      arraylist.add(triangle);
	      
	      processShape(rectangle);
	      processShape(circle);
	      processShape(triangle);

   }
   
   public void processShape(Shape s){
	      s.printInfo();
	      if( s instanceof Rectangle){
	         ( (Rectangle) s).drawRectnagle();

   }
   
   }
	
   
}