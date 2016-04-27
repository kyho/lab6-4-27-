package lab6;

public abstract class Shape {
	
	private int id;
	
	public Shape(int id)
	{
		this.setId(id);
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
