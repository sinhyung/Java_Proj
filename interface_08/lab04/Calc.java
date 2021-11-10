package interface_08.lab04;

public interface Calc {
	double PI = 3.14;			// ���
	int ERROR = -9999999;
	
	int add ( int num1, int num2);			// �߻� �޼ҵ� 
	int substract (int num1 , int num2);
	int times ( int num1, int num2);
	int divide ( int num1, int num2);
	
	//�������̽����� �����ڵ尡 �ִ� �޼ҵ� 
		//default �޼ҵ� : ��� (0)
		//static �޼ҵ� : stack ���� ����, ��ü �������� ���.
		//private �޼ҵ� : Ŭ���� ���ο����� ���. ���(x)
		//private static �޼ҵ� : Ŭ���� ���ο����� ��� , ��� (x), Stack ���������� ���
	
	default void description() {	// JAVA 8.0
		System.out.println("���� ���⸦ ���� �մϴ�. ");
		
	}
	static int total (int[] arr) {		//static �޼ҵ� : ��ü �������� ���.
		int total = 0; 
		for ( int i : arr) {
			total += i; 
		}		
		return total ;	
	}
	private void myMythod () {		// Java 9.0 ���� ���� 
		System.out.println("Private �޼ҵ� �Դϴ�. ");
	}
	private static void myStaticMethod () {			//Java 9.0 ����
		System.out.println("Private static �޼ҵ� �Դϴ�. ");
	}
	

}
