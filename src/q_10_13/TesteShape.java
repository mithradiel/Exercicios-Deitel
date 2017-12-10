package q_10_13;

public class TesteShape {
	public static void main(String[] args) {
		Shape[] formas = new Shape[6];
		formas[0] = new Circle(10);
		formas[1] = new Rectangle(5,5);
		formas[2] = new Triangle(10,5);
		formas[3] = new Circle(10);
		formas[4] = new Cube(5);
		formas[5] = new Tetrahedro(10,5);
	
	
		for (int i =0; i<formas.length;i++) {
			if (formas[i].getClass().getSuperclass() == formas[4].getClass().getSuperclass()) {
				System.out.println(formas[i].getVolume());
			}
			else {
				System.out.println(formas[i].getArea());
			}
		}
   }

}
