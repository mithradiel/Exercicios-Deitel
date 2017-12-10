package q_9_15;

public class HourlyEmployee extends Employee{
	private double hours;
	private double wage;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
			double wage, double hours) {
		super(firstName,lastName,socialSecurityNumber);
		
		this.hours = hours;
		this.wage = wage;
	}
	
	public void setWage(double newWage) {
		if (newWage >=0) {
			this.wage = newWage;
		}
		else {
			throw new IllegalArgumentException("Wage não pode ser negativo");
		}
	}
	public void setHours(double newHours) {
		if (newHours<=168) {
			this.hours = newHours;
		}
		else {
			throw new IllegalArgumentException("hours não pode ser maior que 168");
		}
	}
	
	public double getHours() {
		return this.hours;
	}
	public double getWage() {
		return this.wage;
	}
	public double earnings() {
		return this.wage*this.hours;
	}
	public String toString() {
		return super.toString() + String.format("%s: %s%n%s: %s%n%s: %s%n",
				"Horas trabalhadas",String.valueOf(this.hours),"Remuneração/hora",String.valueOf(this.wage),
				"Pagamento da semana", String.valueOf(this.earnings()));
	}

}
