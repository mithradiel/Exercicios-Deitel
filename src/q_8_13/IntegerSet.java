package q_8_13;

public class IntegerSet {
	private boolean[] conjunto = new boolean[101];
	
	public IntegerSet(){
		for (int i = 0; i< 101; i++) {
			conjunto[i]= false;
		}
	}
	
	public IntegerSet(int[] lista) {
		for (int i = 0; i<lista.length;i++) {
			this.conjunto[lista[i]] = true;
		}
	}
	
	public static IntegerSet union (IntegerSet a, IntegerSet b) {
		IntegerSet c = new IntegerSet();
		for (int i = 0; i < b.conjunto.length; i++) {
			if (b.conjunto[i] == true || a.conjunto[i] == true) {
				c.conjunto[i] = true;
			}
		}
		return c;
	}
	public static IntegerSet intersection (IntegerSet a, IntegerSet b) {
		IntegerSet c = new IntegerSet();
		for (int i = 0; i < b.conjunto.length; i++) {
			if (b.conjunto[i] == true && a.conjunto[i] == true) {
				c.conjunto[i] = true;
			}
		}
		return c;
	}
	
	public void insertElement(int a) {
		this.conjunto[a] = true;
	}
	public void deletElement(int a) {
		this.conjunto[a] = false;
	}
	
	public String toString() {
		String a = "[";
		for (int i = 0; i<this.conjunto.length; i++) {
			if (this.conjunto[i] == true) {
				if (i!=0) {
					a+=",";
				}
				a += " " + String.valueOf(i);
			}
		}
		a+=" ]";
		return a;
	}
	
	public boolean isEqualTo(IntegerSet b) {
		boolean a = false;
		for (int i = 0; i<this.conjunto.length; i++) {
			if (this.conjunto[i] == b.conjunto[i]) {
				a =  true;
			}
			else {
				a =  false;
			}
		}
		return a;
		
	}

}
