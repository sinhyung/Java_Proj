package interface_08.lab01;

public class InterfaceEx01 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();		// default �޼ҵ� : PhoneInterface���� ����� �޼ҵ� (����� ���ؼ� )
		phone.sendCall();		// �������̵� 	(PhoneInterface ����)
		phone.play();			// �������̵� (MP3Interface���� ����)
		System.out.println("3�� 5�� ���ϸ� : " + phone.calculate(3, 5));  //PDAŬ�������� ���
		phone.schedule();		// SmartPhone���� �߰��� �޼ҵ� 
		
	
	}

}
