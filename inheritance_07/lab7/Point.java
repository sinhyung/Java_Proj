package inheritance_07.lab7;

public class Point {	// �θ� Ŭ����
	private int x, y ; 		//���� ��ǥ, x, y 
	
	public Point () {
		this.x = this.y = 0 ;
	}
	public Point ( int x, int y) {
		this.x = x ; this.y = y;
	}
	
	public void showPoint () { 	//���� ��ǥ ���
		System.out.println( "( "  + x + " , " + y +  ")" );  
	}

}
