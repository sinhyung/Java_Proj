package interface_08.lab01;

public interface PhoneInterface { //�������̽� : ��� + �߻�޼ҵ� + default �޼ҵ� (�����ڵ�)
	int TIMEOUT = 10000;		// ��� : public static final ������
	void sendCall();			// �߻�޼ҵ� : public abstract ������
	void receiveCall();			// �߻�޼ҵ� 
	default void printLogo() {	// default �޼ҵ� : public �� ������, ���� Ŭ������ ��ӵǾ� ����
		System.out.println("�ΰ� ����Ʈ �մϴ�. ");
	}

}
