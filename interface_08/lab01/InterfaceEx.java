package interface_08.lab01;

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();			//default �޼ҵ� ȣ�� : �������̽����� ���� �ڵ尡 ����� �޼ҵ� 
		phone.sendCall();
		phone.receiveCall();
		phone.flash();			// SansungPhone ���� ���ϴ� �޼ҵ� 
		
		System.out.println("====================");
		// �������̽��� ��ü�� ������ �� ����. Ÿ�� ��ȯ�� �����ϴ�.  
		//PhoneInterface ph = new PhoneInterface();		//���� �߻�
		PhoneInterface ph = new SamsungPhone();			//Ÿ�� ��ȯ�� �����ϴ�.  (��ĳ����)
		ph.printLogo();		// default �޼ҵ�
		ph.sendCall();		// �������̵�
		ph.receiveCall();	// �������̵�
		SamsungPhone ss = (SamsungPhone) ph;		// �ٿ�ĳ����
		ss.flash();
		
		
	}

}
