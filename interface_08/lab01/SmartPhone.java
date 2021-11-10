package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	// SmartPhone Ŭ������ PDA Ŭ������ ��� �ް� �ְ�, MobilePhoneInterface, MP3Interface�� ���� 
	// ���߻���� ������ �ʴ´�. (�ڽ��� �ϳ��� �θ� Ŭ������ ������. )
	// �������̽� ���� ����� ���ȴ�. 

	@Override
	public void sendCall() {	//PhoneInterface���� �����س��� �޼ҵ� (���)
		System.out.println("������ ������~~~");
	}

	@Override
	public void receiveCall() {  //PhoneInterface���� �����س��� �޼ҵ� (���)
		System.out.println("��ȭ �Ծ��");
	}

	@Override
	public void play() {   // MP3Interface
		System.out.println("���� ���� �մϴ�. ");
	}

	@Override
	public void stop() {	//MP3Interface
		System.out.println("������ �ߴ� �մϴ�. ");
	}

	@Override
	public void sendSMS() {		//MobilePhoneInterface
		System.out.println("���� ���ϴ�. ");
	}

	@Override
	public void receiveSMS() {	//MobilePhoneInterface
		System.out.println("���� �Ծ��.");
	}

	public void schedule() {	// �߰��� �ۼ��� �޼ҵ� 
		System.out.println("���� ���� �մϴ�. ");
	}
	
}
