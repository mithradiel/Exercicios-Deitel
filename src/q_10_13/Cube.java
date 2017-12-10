package q_10_13;

public class Cube extends ThreeDimensional{
	private double aresta;
	public Cube(double aresta) {
		super();
		this.aresta = aresta;
	}
	@Override
	public double getArea() {
		return (this.aresta*2)*6;
	}
	@Override
	public double getVolume() {
		return this.aresta*this.aresta*this.aresta;
	}

}
