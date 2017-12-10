package q_10_14;

public class PieceWorker extends Employee{
	private double wage;
	private int piece;
	public PieceWorker(String firstName, String lastName, 
		      String socialSecurityNumber, Date aniversario, double wage,int piece) {
		super(firstName, lastName, socialSecurityNumber, aniversario);
		this.setWage(wage);
		this.setPiece(piece);
	}
	@Override
	public double earnings() {
		
		return this.wage*this.piece;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getPiece() {
		return piece;
	}
	public void setPiece(int piece) {
		this.piece = piece;
	}
	
	@Override
	public String toString() {
		return String.format("Piece Worker: %s%n%s: $%s; %s: %s",
		         super.toString(), "piece wage", String.valueOf(getWage()),                     
		         "pieces manufactured", String.valueOf(getPiece()));
	}

}
