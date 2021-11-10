package lamda_14.inner_class;

class OutClass{		//�ܺ� Ŭ���� : (�ν��Ͻ� �ܺ� Ŭ���� : �ν��Ͻ����� , ���� ���� , �ν��Ͻ��޼ҵ�, �����޼ҵ� ������ ����) 
	private int num = 10;			//�ܺ� Ŭ������ private ����, �ν��Ͻ�(���)����, ��üȭ(���)
	private static int sNum = 20;	//�ܺ� Ŭ������ private ����, ��������, ��üȭ(���), ��üȭ���̵� ��� (Ŭ�����̸����)
	
	private InClass inClass;	//�ܺ��� Ŭ������ ��üȭ �Ҷ�, ���� Ŭ������ ��üȭ �ϱ� ���� ����
	public OutClass () {	//������ : �ܺ� Ŭ������ ������ ȣ��� ���� Ŭ������ ��üȭ
		inClass = new InClass();
	}
	void outTest1() {
		System.out.println("�ν��Ͻ� �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ�");
	}
	static void outTest2() {		//���� �޼ҵ�
		System.out.println("�ν��Ͻ� �ܺ� Ŭ������ �޼ҵ�");
	}
	public void usingClass() {	//���� Ŭ������ �޼ҵ� ȣ��
		inClass.inTest();
	}
	
	class InClass{	//���� Ŭ����(�ν��Ͻ� ���� Ŭ����) : �ܺ� Ŭ������ ����ϰ� �۾��� ó�� 
		int inNum = 100;	//���� Ŭ������ �ν��Ͻ�(���) ����, ��üȭ ��������  ���
	//	static int sInNum = 200;	//�ν��Ͻ� ���� Ŭ���������� ���� ������ ��� �� �� ����.(������)
		//num += 10;
		
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ��������");
			System.out.println("InClass inNum = " + inNum + ("���� Ŭ������ �ν��Ͻ� ����"));
		}
		
		/*
		static void sTest() {	//���� �޼ҵ� : �ν��Ͻ� ���� Ŭ�������� ���Ұ���
			
		}
		*/
		public void singClass() {	//���� Ŭ���� ������ ����Ͽ� �޼ҵ� ȣ���ϱ�
			inClass.inTest();
		}
	} //���� Ŭ���� ��
	static class InStaticClass{ 	//���� ���� Ŭ���� : �ν��Ͻ�����, �����ۤ���,�ν��Ͻ��޼ҵ�,�����޼ҵ� ��� ��밡�� 
		int inNum = 100; //�ν��Ͻ�����
		static int sInNum = 200; //��������
		
		void inTest() {// �ν��Ͻ��޼ҵ� : �ν��Ͻ� ������ ���, ���� ���� ��� ����
			//num +=10; 	// �ܺ� Ŭ������ �ν��Ͻ� ������ ��� �� �� ����.
			inNum += 10;
			//sInnum += 10;
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���");
		}
		static void sTest() {  //�����޼ҵ� : �ν��Ͻ� ���� ���Ұ�, ���� ������ ��밡��
			//num+=10;
			//inNum += 10;	//���� Ŭ������ �ν��Ͻ� ���� (����)
			sInNum += 10;
			
			
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ ����ƽ ���� ���");
			System.out.println("InStaticClass sInNum = " + sInNum + "���� Ŭ������ ����ƽ ���� ���");
			
		}
	
	
	
	
}	//��������Ŭ������
	
	}//�ܺ� Ŭ������ ��



public class InnerClassTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();	//�ܺ� Ŭ���� ��ü ����
		System.out.println("�ܺ� Ŭ������ ȣ���Ͽ� ����Ŭ���� ����� ȣ��");
		outClass.usingClass();	//�ܺ� Ŭ������ usingClass() �޼ҵ� ȣ�� (���� Ŭ������ inTest() �޼ҵ� ȣ��)
		System.out.println();
		
		//OutClass.InClass inClass2 = new OutClass.InClass();		//������
		//InClass�� �ν��Ͻ� ���� Ŭ���� �̹Ƿ� ���� Ŭ������ �ν��Ͻ�ȭ�ؼ� <<�ν��Ͻ��̸�.new>>
		
		
		//���� �ν��Ͻ� Ŭ���� ��ü ����
		OutClass.InClass inClass = outClass.new InClass();	//���� Ŭ���� ��ü ����
		System.out.println("�ܺ� Ŭ���� ������ ����Ͽ� ���� Ŭ���� ��ü ���� ");
		inClass.inTest();	// ����Ŭ������ �޼ҵ� ȣ��
		
		//�ܺ� Ŭ������ �������� �ʰ� ���� ���� Ŭ���� ȣ�� 
		//�������� Ŭ������ �ܺ�Ŭ������ �ν��Ͻ� �������� ��ü ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �ν��Ͻ� �޼ҵ� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ�� ");
		OutClass.InStaticClass.sTest();		//��ü ���� ���� Ŭ���� �̸����� ȣ��
		
		
		
		

	}

}
