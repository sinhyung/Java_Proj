package interface_08;

public interface PhoneInterface2 { // �������̽��� ����� �߻�޼ҵ�, default �޼ҵ�	<== ������ �ü� ����.
									//�������̽� �������� ���������ڰ� ���� �Ǹ� : << public >>
									// �ܺ��� ����ڵ��� ���� �ý��ۿ� ���� : public 
	
	
	 int timeout = 10000; 				// ��� : ���� ���� : public static final
	 void sandCall ();					// �߻�޼ҵ� : public abstract
	 void recieveCall();				//public abstract
	 default void printLogo() {	        //public ���� ���� 
		 								// default �޼ҵ� : �������̽����� �����ΰ� �ִ� �޼ҵ� �����
		System.out.println(" �ΰ� ����Ʈ �մϴ�. ");
	}
}
