package q_11_17;

import java.io.IOException;

import javax.imageio.IIOException;

public class TesteException {
	public TesteException(){
		
	}
	public void getName() throws ExceptionB {
		throw new ExceptionB("O nome n�o existe");
	}
	public void getAge() throws ExceptionA{
		throw new ExceptionB("N�o possui idade");
	}
	public String getNumber() throws NullPointerException{
		throw new NullPointerException("N�mero � nulo");
	}
	public void connect() throws IOException{
		throw new IIOException("Sem conex�o");
		
	}
}
