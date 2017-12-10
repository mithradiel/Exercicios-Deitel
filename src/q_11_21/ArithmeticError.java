package q_11_21;

public class ArithmeticError {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			throw e; 
		}
	}
}
