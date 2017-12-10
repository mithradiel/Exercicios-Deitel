package q_8_4;

import javax.swing.JOptionPane;

public class Rectangle {
	
	private double width;
	private double length;
	public double area;
	public double perimetro;
	
	public Rectangle() {
		width = 1;
		length = 1;
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width > 0.0 & width < 20.0) {
			this.width = width;
		}
		else {
			JOptionPane.showMessageDialog(null,"Número muito baixo ou muito alto, largura igualada a 1");
		}
		
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length > 0.0 & length < 20.0) {
			this.length = length;
		}
		else {
			JOptionPane.showMessageDialog(null,"Número muito baixo ou muito alto, altura igualada a 1");
		}
	}
	
	public double calcularArea() {
		area = this.length*this.width; 
		return area;
		
	}
	
	public double calcularPerimetro() {
		perimetro = this.length*2+this.width*2;
		return perimetro;
	}
	

}
