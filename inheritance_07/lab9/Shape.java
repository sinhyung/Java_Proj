package inheritance_07.lab9;	//������ ���� : �޼ҵ� �������̵�
class Shape {		// ���� Ŭ���� , �޼ҵ� ������[�������̵�]�� ��� �ؼ� �������� ���� 
	public Shape next;		// ��ü ����, Shape : ��ü�� ������ Ÿ��,  next : �ν��Ͻ� ����
	public Shape() {next =null;}	// ������ 
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override
	public void draw() {			// �������̵�
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {			// �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {			// �������̵�
		System.out.println("Circle");
	}
}
