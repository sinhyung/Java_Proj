package inheritance_07.abstract_ex;

public abstract class Computer {	//�߻� Ŭ���� : Ŭ���� ���ο� �߻� �޼ҵ尡 1�� �̻� �����ϸ� 
							// �߻�Ŭ���� : �߻� �޼ҵ带 ������ Ŭ���� 
							// �߻� Ŭ������ ��üȭ �� �� ����. 
							// �߻� Ŭ������ �߻�޼ҵ带 �����ϴ� Ŭ������ ����(���, �������̵�)
	
	public abstract void display();	//�߻� �޼ҵ� : ����ΰ� ���� �޼ҵ�, ���� �Ǿ��ִ� �޼ҵ�  
							// �ݵ�� �ڽ�Ŭ�������� �޼ҵ� �������̵��� ���ؼ� ����.
							// �޼ҵ� �̸� ��Ģ�� ����
	public void display2() {}  // �Ϲ� �޼ҵ� : () : �Ű����� ��ǲ, {} : ����� : 
	
	public abstract void typing();
	
	public void turnOn () {						//�Ϲ� �޼ҵ�
		System.out.println("������ �մϴ�. ");
	}
	public void turnOff () {					//�Ϲ� �޼ҵ�
		System.out.println("������ ���ϴ�. ");
	}
	
}
