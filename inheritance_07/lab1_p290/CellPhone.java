package inheritance_07.lab1_p290;

public class CellPhone { // ��� �ڵ������� �������� ����Ǵ� �ڵ带 ���� Ŭ�������� ���� : 
							// �ʵ� + �޼ҵ尡 ���� Ŭ������ ���. 
	String model ;
	String color ;
	
	void powerOn() {
		System.out.println("������ �մϴ�. ");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice (String message) {
		System.out.println("���� : " + message );
	}
	void receiveVoice(String message) { 
		System.out.println("����: " + message); 
		}
	void hangUp () {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
