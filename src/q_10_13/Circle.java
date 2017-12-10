package q_10_13;

public class Circle extends TwoDimensional {
	private double raio;
	public Circle(double raio) {
		super();
		this.raio = raio;
	}
	@Override
	public double getArea() {
		
		return (this.raio*this.raio)*Math.PI;
	}
	@Override
	public double getVolume() {
		return 0;
	}
}
