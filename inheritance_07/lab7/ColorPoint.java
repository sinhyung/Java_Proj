package inheritance_07.lab7;

public class ColorPoint extends Point {
	private String color ; 		//�ʵ�
	
	public ColorPoint(int x, int y , String color) {	//������
		super (x,y);			// ���� Ŭ������ �����ڸ� ȣ�� (�Ű����� 2��)
		this.color = color;
	}
	
	public void showColorPoint() {	// 
		System.out.println(color);
		showPoint();	// ��ӵ� �޼ҵ� ȣ�� : Point Ŭ������ �޼ҵ�
	}
	

}
