package interface_08;

public interface PhoneInterface { // �������̽� : Ŭ���̾�Ʈ�� ȸ�系���� ���� ���񽺸� ������ ���ִ� ����
								//�������̽� ���� ���, �߻�޼ҵ� : JVM 7.0
								// �������̽� ���� ���, �߻�޼ҵ�, default �޼ҵ� : JVM8.0[1.8]
								// ������ �������̽����� �ü� ����. ��ü�� ������ �� ����. 
								// �������̽� ������ ���� �ڵ尡 ���� �޼ҵ� 
									// default �޼ҵ� (8.0) : ��� , ���� Ŭ�������� ������ ����
									// static �޼ҵ�  : stack ������ ���� 
									// private �޼ҵ� : ��� (x), �������̽� �������� ���.
	public static final int timeout = 10000; 
	public abstract void sandCall ();
	public abstract void recieveCall();
	public default void printLogo() {
		System.out.println(" �ΰ� ����Ʈ �մϴ�. ");
	}
	
}
