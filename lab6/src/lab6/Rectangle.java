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
	   System.out.format("Rectangle with an id of %d, "
	   		+ "width of %f, height of %f, area of %f, "
	   		+ "and perimeter of %f", this.getId(), this.width, this.height, this.caculateArea(), this.caculatePerimeter());
	   
	   System.out.println();
      
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
