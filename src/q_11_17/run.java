package q_11_17;

import java.io.IOException;

public class run {
	public static void main(String[] args) {
		TesteException a = new TesteException();
		try {
			a.getAge();
		}
		catch(ExceptionA e){
			System.out.println(e.getMessage());
		}
		try {
			a.getName();
		}
		catch(ExceptionB e) {
			System.out.println(e.getMessage());
		}
		try {
			a.connect();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.getNumber();
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
}
