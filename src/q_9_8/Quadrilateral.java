package q_9_8;

public class Quadrilateral {
	private int[] p1 = new int[2];
	private int[] p2 = new int[2];
	private int[] p3 = new int[2];
	private int[] p4 = new int[2];
	
	public Quadrilateral(int p1x,int p1y, int p2x, int p2y,
						 int p3x, int p3y, int p4x, int p4y ) {
		this.p1[0] = p1x;
		this.p1[1] = p1y;
		this.p2[0] = p2x;
		this.p2[1] = p2y;
		this.p3[0] = p3x;
		this.p3[1] = p3y;
		this.p4[0] = p4x;
		this.p4[1] = p4y;
	}
	
	public int[][] getPoints() {
		int[][] a = {this.p1,this.p2,this.p3,this.p4};
		return a;
	}

}
