package inheritance_07.lab5_super;

public class B extends A {
	
	public B() {
		//super();
		System.out.println("������ B");
	}
	
	public B(int x) {
		//super();		//�����Ǿ� ���� ��� �⺻�� 
		super(x);		// ������ �����ڸ� ȣ�� , �Ű������� �ִ� �����ڸ� ȣ��
					
		System.out.println("�Ű����� ������ B : " + x );
	}
}
