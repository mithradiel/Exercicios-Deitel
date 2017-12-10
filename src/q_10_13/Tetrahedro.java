package q_10_13;
public class Tetrahedro extends ThreeDimensional{
	private double lado;
	private double altura;
	public Tetrahedro(double lado, double altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return 4*((Math.sqrt(3)*this.lado*this.lado)/4);
	}
	@Override
	public double getVolume() {
		return ((Math.sqrt(3)*(this.lado*this.lado))/4*this.altura)/3;
	}

}
