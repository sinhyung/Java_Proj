package lamda_14.inner_class;

//���� ���� Ŭ���� (Local Inner Class) : �޼ҵ� ���ο� Ŭ������ ���� <=== �͸� Ŭ����
//�߻� Ŭ������ �߻�޼ҵ�, �������̽��� �߻�޼ҵ带 ���� �Ҷ� ������ ���� Ŭ������ ������ �ʰ� ���
	//1. ����Ŭ������ ����: ���������� ����Ѵٸ�.
	//2. �͸� Ŭ������ ����: ��� ���. (��� ����ϰ� ������)


// �޼ҵ� ���� ������ ��������, �޼ҵ� �������� ����, �޼ҵ尡 ȣ���� ������ �����

class Outer{	//�ܺ� Ŭ���� (�ν��Ͻ� Ŭ����)
	int outNum = 100;		//�ν��Ͻ�����
	static int sNum = 200;	//���� ����
	
Runnable getRunnable(int i) {	//java.lang.Runnable <==�������̽�
	int num = 100;
	
	class MyRunnable implements Runnable{	//���� ���� Ŭ����
		int localNum = 10;	//���� ���� 
		
		// �޼ҵ忡�� ����� ������ �Ű������� �������� Ŭ���������� ����� �ٲ�� (final �� �ٲ��)

		@Override
		public void run() {
			//num = 200;		// ������, ���� ������ ����� �ٲ��
			//i=100;			//������,�Ű����� ���� ���� ���� ó�� ����� �ٲ�
			
			System.out.println(" i = " + i);
			System.out.println("num = " + num);
			System.out.println("localNum = " + localNum);
			
			System.out.println("outNum =" + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����");
			System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ������ ��������");
			
					
			
		}
		
	}


	return new MyRunnable();
}
}



public class LocalInnerClass {
	//���� ���� Ŭ����(Local Inner Class) : <== �͸� ���� Ŭ���� �� ��� 
		//�޼ҵ� ���� Ŭ������ ����
		//�޼ҵ尡 ȣ�� �Ҷ� ���, �޼ҵ尡 ȣ���� ������ ����
		//�͸� ���� Ŭ���� : ���� ���� Ŭ�������� Ŭ���� �̸��� ���� �� �� 
		// <== ���ٽ��� ���������� �ڹٿ��� �͸� ���� Ŭ������ �۵�
	

		
		
		

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	//�޼ҵ� ȣ��� Runnable ��ü�� ���� �ް�
		runner.run();	//�������̵��� run() �޼ҵ� ȣ��

	}

}





