package q_8_4;

import javax.swing.JOptionPane;

public class TesteRectangle {
	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle();
		double width;
		double length;
		
		width = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a largura"));
		length = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a altura"));
		
		retangulo.setWidth(width);
		retangulo.setLength(length);
		JOptionPane.showMessageDialog(null, "A altura é: "+retangulo.getLength());
		JOptionPane.showMessageDialog(null,"A largura é: "+retangulo.getWidth());
		JOptionPane.showMessageDialog(null,"O perimetro é: " + retangulo.calcularPerimetro());
		JOptionPane.showMessageDialog(null,"A área é: " + retangulo.calcularArea());
	}
	

}
