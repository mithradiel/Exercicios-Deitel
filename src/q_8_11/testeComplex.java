package q_8_11;

public class testeComplex {
	public static void main(String[] args) {
		Complex a = new Complex(10,5);
		Complex b = new Complex();
		Complex c;
		Complex d;
		
		c = a.soma(b);
		System.out.println(c.toString());
		d = a.subtracao(b);
		System.out.println(d.toString());
		
	}

}
