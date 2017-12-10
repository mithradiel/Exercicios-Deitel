package q_8_7;

public class testeTime2 {
	public static void main(String[] args) {
		Time2 time = new Time2(22,58,59);
		System.out.println(time.toUniversalString());
		time.incrementHour();
		System.out.println(time.toUniversalString());
		time.incrementMinute();
		System.out.println(time.toUniversalString());
		time.incrementSecond();
		System.out.println(time.toUniversalString());
	}

}
