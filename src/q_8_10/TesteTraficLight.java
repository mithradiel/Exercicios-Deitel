package q_8_10;

public class TesteTraficLight {
	public static void main(String[] args) {
		TraficLight2 teste = TraficLight2.YELLOW;
		TraficLight2 teste2 = TraficLight2.RED;
		TraficLight2 teste3 = TraficLight2.GREEN;
		System.out.println("A duração do farol vermelho é "+teste2.getDuracao());
		System.out.println("A duração do farol amarelo é "+teste.getDuracao());
		System.out.println("A duração do farol verde é "+teste3.getDuracao());
	}

}
