package lamda_14.inner_class;

class A{
	int a = 10;			// �ν��Ͻ� ����
	static int b = 20;	// ���� ����
	
	void a() {			// �ν��Ͻ� �޼ҵ�
		System.out.println(a);
	}
	static void b() {	// ���� �޼ҵ�
		System.out.println(b);
	}
}

class B{
	int a = 100;
	static int b = 200;
	
	Runnable c = new Runnable() {		//�͸� Ŭ���� 
		@Override
		public void run() {
			System.out.println("Run�� ��� �մϴ�");
		}
		
	};
}






public class AnonymousClassTest01 {

	public static void main(String[] args) {
		System.out.println("=======�ν��Ͻ� ���� ��� �ϱ�=======");	//��ü�� ���� �ؼ� ���
		A a = new A();		// ��üȭ 
		a.a();				// �ν��Ͻ� �޼ҵ� ȣ��
		a.b();				// ���� �޼ҵ� ȣ��
		
		System.out.println("=====�ν��Ͻ� �������� ��ü�̸����� ���");
		A.b();			//���� �޼ҵ�, ���� �ʵ常 ȣ��
		
		System.out.println("====�͸� Ŭ���� ����====") ;
		
		
		
		
	}

}
