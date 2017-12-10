package q_10_13;

public class Sphere extends ThreeDimensional{
	private double raio;
	public Sphere(double raio) {
		super();
		this.raio = raio;
	}
	@Override
	public double getArea() {
		return 4*Math.PI*(this.raio*this.raio);
	}
	public double getVolume() {
		return (4*Math.PI*(this.raio*this.raio*this.raio))/3;
	}

}
