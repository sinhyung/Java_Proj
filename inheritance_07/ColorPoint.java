package inheritance_07;

public class ColorPoint extends Point { // Point Ŭ������ ��� �޴� ColorPoint �ڽ� Ŭ����
	private  String color ; 		// ���� ��
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint () {   // �÷� ���� ��ǥ�� ��� 
		System.out.println(color);
		showpoint();			// �θ�Ŭ�������� ��� ���� �޼ҵ� ȣ�� 
	}
}
