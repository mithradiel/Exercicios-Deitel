package q_11_19;

public class SomeClass {
	public SomeClass(String name) throws NullPointerException{
		if (name == "") {
			throw new NullPointerException("Nome n�o pode ser vazio");
		}
	}
}
