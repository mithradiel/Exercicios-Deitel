package q_11_16;

public class TesteExceptionA {
	
	public TesteExceptionA(){
		
	}
	public void getName() throws ExceptionA {
		throw new ExceptionA("No name found");
	}

}
