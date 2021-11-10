package generic_12.ex02;

public class Point {		//좌표점을 저장.
	private int x, y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")" ;
	}
}
