package interface_08.lab01;

public interface MobilePhoneInterface extends PhoneInterface {
			//interface�� interface�� ��� : extends
	
	//void sendCall(); 		// ������� ������
	//void receiveCall(); 	//������� ������
	void sendSMS();			//�߻� �޼ҵ�
	void receiveSMS();		//�߻� �޼ҵ�
}
