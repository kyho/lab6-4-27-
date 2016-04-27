package lab6;

public abstract class Shape {
	
	private int id;
	
	public Shape()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public abstract double caculateArea();
	public abstract double caculatePerimeter();
	public abstract void printInfo();

}
