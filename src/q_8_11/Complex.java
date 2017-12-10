package q_8_11;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex() {
		this.real = 1;
		this.imaginary = 1;
	}
	
	public Complex soma(Complex b) {
		Complex c = new Complex((this.real + b.real), (this.imaginary + b.imaginary));
		return c;
	}
	
	public Complex subtracao(Complex b) {
		Complex c = new Complex(-this.real + b.real, -this.imaginary + b.imaginary);
		return c;
	}
	
	public String toString() {
		return ( String.valueOf(this.real) +" + "+String.valueOf(this.imaginary + "*\u221a-1")) ;
	}
	

}
