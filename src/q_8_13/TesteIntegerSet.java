package q_8_13;

public class TesteIntegerSet {
	public static void main(String[] args) {
		int[] lista = {0,2,3,5,7,10,30,15};
		int[] lista1 = {1,3,7,9,10,30,100,55,60,66,55,0};
		IntegerSet a = new IntegerSet();
		IntegerSet b = new IntegerSet(lista);
		IntegerSet c = new IntegerSet(lista1);
		IntegerSet d = new IntegerSet(lista);
		
		System.out.println(IntegerSet.union(a, b).toString());
		System.out.println(IntegerSet.union(a, b).isEqualTo(b));
		
		c.insertElement(15);
		c.deletElement(3);
		
		System.out.println(IntegerSet.intersection(c, d));
		
	}

}
