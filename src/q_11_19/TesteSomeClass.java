package q_11_19;

public class TesteSomeClass {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			SomeClass a = new SomeClass("");
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
