package inheritance_07.abstract_ex;

public class Desktop extends Computer { // ��ũ��Ʈ Ŭ���� : ��üȭ�� Ŭ���� 

	//================�߻� �޼ҵ� ������ (�������̵�)=======
	@Override
	public void display() {
		System.out.println(" ����ũž �����");
	}

	@Override
	public void typing() {
		System.out.println(" ����ũž Ÿ���� ");
	}
	
	//===============�Ϲݸ޼ҵ� �������̵� ===============
	@Override 
	public void turnOn() {
		super.turnOn();
		System.out.println("����ũž ��ǻ�� �մϴ�. ");	
	}
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("����ũž ��ǻ�� ���ϴ�. ");
	}
	
	public void desktopOnly () {
		System.out.println(" ����ũž�� �����ϴ� �޼ҵ� - desktopOnly");
	}
	
	
	


}
