package basic_class_11.object;

public class String_Ex02 { // concat() : �� ���ڿ��� �����ؼ� ��� : �������� �߻� (
							// ���� ���� ���ڿ��� ������ �� ���. 
							// ������ �޸� ������ ���� ���� ���� , 
	public static void main(String[] args) {
		String javaStr = new String("Java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
						// ������ �߻� : �޸��� ������ ����
		
		javaStr = javaStr.concat(androidStr);  // concat() : �ΰ��� �������� ���� �ؼ� ���.
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
		
	}

}
