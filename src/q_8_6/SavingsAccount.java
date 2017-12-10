package q_8_6;

public class SavingsAccount {
	static double annualInterestRate = 4;
	private double savingsBalance;
	
	public SavingsAccount(double savings) {
		this.savingsBalance = savings;
		
	}
	
	public void calculateMonthlyInterest() {
		this.savingsBalance += this.savingsBalance*annualInterestRate/100/12; 
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	public double getSavingsBalance() {

		return this.savingsBalance;
	}
	
	public void setSavingsBalance(double savings) {
		this.savingsBalance = savings;
	}
}
