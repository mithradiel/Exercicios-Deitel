package q_8_8;

public class TesteDate {
	public static void main(String[] args) {
		Date data = new Date(01,01,1999);
		for (int i = 0; i < 365 ; i++) {
			data.addDay();
			System.out.println(data.toString());
		}
		
		for (int i = 0; i < 12; i++) {
			data.addMonth();
			System.out.println(data.toString());
		}
		
		data.addYear();
		System.out.println(data.toString());
	}
	
}
