package q_8_6;

import java.text.DecimalFormat;

public class testeSavingsAccount {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		SavingsAccount.modifyInterestRate(4);
		
		for (int i = 1; i <= 12; i++) {
			saver1.calculateMonthlyInterest();
			System.out.println("Novo saldo do saver1 = "+df2.format(saver1.getSavingsBalance()) + " em relação ao mês "+i);
		}
		
		for (int i = 1; i <= 12; i++) {
			saver2.calculateMonthlyInterest();
			System.out.println("Novo saldo do saver2 = "+df2.format(saver2.getSavingsBalance()) + " em relação ao mês "+i);
		}
		
		SavingsAccount.modifyInterestRate(5);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Novo saldo do saver1 = " + df2.format(saver1.getSavingsBalance()));
		System.out.println("Novo saldo do saver2 = "+df2.format(saver2.getSavingsBalance()));
		
		
		
		
	}

}
