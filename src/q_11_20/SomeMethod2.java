package q_11_20;

public class SomeMethod2 {
	public static void main(String[] args) throws Exception{
		SomeMethod a = new SomeMethod();
		try {
			a.lançarExcecao();
		}
		catch(Exception e) {
			throw e;
		}
	}
}
