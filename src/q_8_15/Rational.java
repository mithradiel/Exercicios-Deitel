package q_8_15;

public class Rational {
	private int a;
	private int b;
	private int c;
	private int min;
	public Rational(int a, int b) {
		this.a = a;
		this.b = b;
		this.max(a, b);
		
		
	}
	
	private int min(Rational other) {

		return (this.b*other.b)/this.c;
	}
	public void max(int a, int b) {
		while(b!=0) {
			int r = a % b;
		    a = b;
			b = r;
				   
		}
		this.c=a;
		this.a = this.a/this.c;
		this.b = this.b/this.c;
	}
	
	 public void somarPor(Rational other) {
		 this.min = min(other);
		 this.a = ((this.min/this.b)*this.a) + ((this.min/other.b*other.a));
		 this.b = this.min;
		 this.max(this.a,this.b);
	 }
	 
	 public void subtrairPor(Rational other) {
		 this.min = min(other);
		 this.a = ((this.min/this.b)*this.a) - ((this.min/other.b*other.a));
		 this.b = this.min;
		 this.max(this.a,this.b);
	 }
	 
	 public void multiplicaoPor(Rational other) {
		 this.a = this.a*other.a;
		 this.b = this.b*other.b;
		 this.max(this.a,this.b);
	 }
	 public void dividirPor(Rational other) {
		 this.a = this.a*other.b;
		 this.b = this.b*other.a;
		 this.max(this.a,this.b);
	 }
	 
	 public String toString() {
		 
		 return this.a +"/"+this.b;
	 }
	 
	public String toStringD() {
		double a = (double)this.a/this.b;
		return String.valueOf(a);
	}
	

}
