package q_11_16;

public class TesteException {
	public static void main(String[] args) throws ExceptionA {
		TesteExceptionA a = new TesteExceptionA();
		try {
			a.getName();
		}
		catch (ExceptionB e) {
			throw new ExceptionA("Não pode ser dividido por zero");
		}
		try {
			a.getName();
		}
		catch (ExceptionA e) {
			throw new ExceptionA("Não pode ser dividido por zero");
		}
		try {
			a.getName();
		}
		catch (ExceptionC e) {
			throw new ExceptionA("Não pode ser dividido por zero");
		}
	}
}
