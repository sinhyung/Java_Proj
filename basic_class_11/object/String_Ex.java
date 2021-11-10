package basic_class_11.object;

public class String_Ex {

	public static void main(String[] args) {
		// String , Interger, Boolean ���� toString() �޼ҵ尡 ������ �Ǿ��� �ִ�. 
		// String , Interger, Boolean ���� equals() �޼ҵ嵵 ������ �Ǿ��� �ִ�. 
		
		// <String �� ��üȭ �ؼ� ��ü ������ ����> : Heap ������ ���� 
		String str1 = new String ("ȫ�浿");
		String str2 = new String ("ȫ�浿");
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));		// 10������ ���
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1 == str2);		// "==" : ��ü�� ���Ҷ� ��ü�� ������ ��
		System.out.println(str1.equals(str2));	// equals() : ���� ����
			
		//<String �� ��üȭ ���� �ʰ� ������ ����> : ���� ���Ǯ�� �����̵� ( �����̸��� ������ �� ���� �ּ�)
		System.out.println("===============");
		String str3 = "�̼���";
		String str4 = "�̼���";
		
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
	}

}
