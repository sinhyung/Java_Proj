package basic_class_11.object.clone_ex;

class Point {
	int x;	// ���� ��ǥ : x ��ǥ
	int y;	// ���� ��ǥ : y ��ǥ 
	
	public Point ( int x, int y) {
		this.x = x;		
		this.y = y; 
	}
	@Override
	public String toString() {				//��ü�� ����Ҷ� toString()�޼ҵ尡 ���
		return "x = " + x + " , y = " + y; 
	}
}
class Circle implements Cloneable {		//Circle Ŭ������ ��ü ������ ��� : implements Cloneable
	Point point ;		 // ��ü���� point ����
	int radius ; 		 // ������
	
	public Circle (int x, int y, int radius) {		// ������ 
		point = new Point (x,y);
		this.radius = radius;
	}
	@Override 
	public String toString() {
		return "������ " + point + "�̰�, �������� " + radius + "�Դϴ�." ;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {	// clone() �޼ҵ� �������̵� 
		return super.clone();
	}	
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Circle circle = new Circle (10, 20, 30);	// ��ü ���� 
		
		Circle copyCircle = (Circle) circle.clone();	// ��ü ���� 
		
		System.out.println(circle);			// ��ü�� ����
		System.out.println(copyCircle);		// ��ü�� ���纻 
		
		System.out.println(System.identityHashCode(circle));	//��ü�� �ּҰ� ���� �ٸ��ϴ�. 	
		System.out.println(System.identityHashCode(copyCircle));
		
	}

}
