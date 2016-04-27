package lab6;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
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
		// TODO Auto-generated method stub
		
	}
	
	
}
