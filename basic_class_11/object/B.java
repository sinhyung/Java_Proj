package basic_class_11.object;

public class B //[extends Object]	<==  �����Ǿ� �ִ�. ������ �ÿ� �����Ϸ��� �ڵ����� ����
	{		// Java�� ��� Ŭ������ Object Ŭ������ ��� �޴´�. 
			// import java.lang.Object
			// java.lang.*		<== �ڵ����� ����Ʈ��. �����Ͻÿ� �����Ϸ��� �ڵ����� import �Ѵ�. 
			// ��� Ŭ������ Object Ŭ������ �޼ҵ带 ����� �� �ִ�. 
			// Object Ŭ������ �޼ҵ带 ������ �� �� �ִ�. ( Final Ű�� �ִ� �޼ҵ�� ������ �Ұ�)
			// ��� Ŭ������ Object Ŭ������ ��ĳ����. 
		
	 B() {} 			// �⺻ ������ = �ٸ� �����ڰ� ������ ���� ���� 
		int a = 1;
		void b () {
			System.out.println( a );
		}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		Object c = b; 		// Object Ÿ������ ��ĳ���� 
		B d = (B) c ;		//�ٿ� ĳ����
		
		b.a = 10;			// B Class
		b.b();				// B Class		
		b.toString();		// Object Ŭ������ �޼ҵ� 
		
		

		
		
	}

}
