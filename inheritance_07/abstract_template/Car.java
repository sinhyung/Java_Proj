package inheritance_07.abstract_template;

public abstract class Car {		//�߻� Ŭ���� 
	
	public abstract void drive();		    // �߻�޼ҵ�, ���� Ŭ�������� �������̵�
	public abstract void stop();			// �߻�޼ҵ�, ���� Ŭ�������� �������̵� 
	public void startCar () {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	final public void run() {  //���ø� �޼ҵ� : ���� Ŭ�������� �������̵� �� �� ����. 
		startCar();				// ���α׷��� ������ ���. 
		drive();
		stop();
		turnOff();
	}
	
}
