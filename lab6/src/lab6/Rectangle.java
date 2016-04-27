package lab6;

public class Rectangle extends Shape{

   private double width;
   private double height;
   //constructor
   public Rectangle(double width, double height) {
      super();
      this.width = width;
      this.height = height;
   }
   
   @Override
   public double caculateArea() {
      return width*height;
   }
   
   @Override
   public double caculatePerimeter() {
      double perimeter=2*(height+width);
      return perimeter;
   }
   @Override
   public void printInfo() {
      
   }
   
   public void drawRectnagle(){
	   
   }
   
}