package q_10_13;

public class Triangle extends TwoDimensional{
	public double height;
	public double width;
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		
		return (this.width*this.height)/2;
	}
	@Override
	public double getVolume() {
		return 0;
	}
	
	
}
