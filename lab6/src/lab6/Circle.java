package lab6;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super(1);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double caculateArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double caculatePerimeter() {
		return 2*radius*Math.PI;
	}

	@Override
	public void printInfo() {
		System.out.format("Circle with an id of %d, radius of %f, area of %f, and perimeter of %f", this.getId(), this.getRadius(), this.caculateArea(), this.caculatePerimeter());
		
		
	}
	
	
}
