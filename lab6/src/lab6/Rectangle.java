package lab6;

public class Rectangle extends Shape{

   private double width;
   private double height;
   //constructor
   public Rectangle(double width, double height) {
      super(2);
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
	   System.out.print("+ ");
	      for(int i=0;i<width-2;i++){
	         System.out.print("- ");
	      }
	      System.out.print("+ ");
	      System.out.println();
	      
	      for(int i=0;i<height-2;i++){
	      System.out.print("| ");
	      for(int j=0;j<width-2;j++){
	         System.out.print("- ");
	      }
	      System.out.print("| ");
	      System.out.println();
	      }
	      
	      System.out.print("+ ");
	      for(int i=0;i<width-2;i++){
	         System.out.print("- ");
	      }
	      System.out.print("+ ");
	      System.out.println();
   }
   
}
