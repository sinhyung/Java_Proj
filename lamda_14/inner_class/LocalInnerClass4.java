package lamda_14.inner_class;

class Outer5{	//�ܺ� Ŭ���� (�ν��Ͻ� Ŭ����)
	int outNum = 100;		//�ν��Ͻ�����
	static int sNum = 200;	//���� ����
	
Runnable getRunnable(int i) {	//java.lang.Runnable 
	int num = 100; //��������
	
	
	



	return new Runnable(){	//���� ���� Ŭ����
		int localNum = 10;	//�ν��Ͻ� ���� 

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
			
		};
		
}
}



public class LocalInnerClass4 {
	//���� ���� Ŭ����(Local Inner Class) : <== �͸� ���� Ŭ���� �� ��� 
		//�޼ҵ� ���� Ŭ������ ����
		//�޼ҵ尡 ȣ�� �Ҷ� ���, �޼ҵ尡 ȣ���� ������ ����
		//�͸� ���� Ŭ���� : ���� ���� Ŭ�������� Ŭ���� �̸��� ���� �� �� 
		// <== ���ٽ��� ���������� �ڹٿ��� �͸� ���� Ŭ������ �۵�
	

		
		
		

	public static void main(String[] args) {
		Outer5 out = new Outer5();
		Runnable runner = out.getRunnable(10);	//�޼ҵ� ȣ��� Runnable ��ü�� ���� �ް�
		runner.run();	//�������̵��� run() �޼ҵ� ȣ��

	}

}





