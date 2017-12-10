package q_8_12;

public class TesteDateAndTime {
	public static void main(String[] args) {
		DateAndTime data = new DateAndTime(12,31,1999,23,59,00);
		
		for (int i = 0; i < 60; i++) {
			data.incrementSecond();
			System.out.println(data.toUniversalString());
		}
	}

}
