package inheritance_07;


public class Point {  // {x, y} �� ������ ǥ���ϴ� Point Ŭ������ �̸� ��ӹ޾�
						//���� ���� ���� ǥ�� �ϴ� colorpoint Ŭ����.
					// �θ� Ŭ���� 
	
	private int x, y ;		// �� ���� �����ϴ� ���� ��ǥ��
	
	public void set (int x, int y) {	// �޼ҵ�� ��ǥ�� ������ ������
		this.x = x ;
		this.y = y ;
	}
	public void showpoint () {
		System.out.println( "(" + x + "," + y + ")" );
	}
	

}
