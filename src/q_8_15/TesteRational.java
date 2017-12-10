package q_8_15;

public class TesteRational {
	public static void main(String[] args) {
		Rational a = new Rational(4,8);
		Rational b = new Rational(1,3);
		Rational c = new Rational(2,4);
		Rational e = new Rational(1,5);
		Rational g = new Rational(4,8);
		
		System.out.println(a.toString());
		b.somarPor(c);
		System.out.println(b.toString());
		b.subtrairPor(e);
		System.out.println(b.toString());
		System.out.println(b.toStringD());
		e.multiplicaoPor(b);
		System.out.println(e.toString());
		g.dividirPor(a);
		System.out.println(g.toString());
	}

}
