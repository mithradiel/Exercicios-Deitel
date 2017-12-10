package q_10_13;

public class Rectangle extends TwoDimensional{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return this.height*this.width;
	}
	@Override
	public double getVolume() {
		return 0;
	}

}
