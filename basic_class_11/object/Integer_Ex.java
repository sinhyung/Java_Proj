package basic_class_11.object;

public class Integer_Ex {

	public static void main(String[] args) {
		// Integer �� toString() ������ �Ǿ� �ִ�. , ���ڸ� �������ش�. 

		// <��üȭ �ؼ� ����>
		Integer i1 = new Integer(100);	// ������ ������ �ö󰥶� ������ �����̾ ��� 
		Integer i2 = new Integer(100);
		
		System.out.println(i1);	
		System.out.println(System.identityHashCode(i1));
		System.out.println(i2);
		System.out.println(System.identityHashCode(i2));
		System.out.println(i1 == i2 );			// ��ü�� �ּҸ� ��
		System.out.println(i1.equals(i2));		// ��ü�� ���� ��
		
		//<��üȭ ���� �ʰ� ����>, 
		Integer i3 = 300;
		Integer i4 = 300; 
		
		System.out.println(i3);
		System.out.println(System.identityHashCode(i3));
		System.out.println(i4);
		System.out.println(System.identityHashCode(i4));
		System.out.println(i3 == i4 );    // ��ü���� "==" �ּҸ� ��
		System.out.println(i3.equals(i4)); // ��ü�� ���� ��
		
		
		
		
	}

}
