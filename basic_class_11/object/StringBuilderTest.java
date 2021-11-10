package basic_class_11.object;

public class StringBuilderTest {	//StringBuilder : ���Ͼ����� ȯ�濡�� �뷮���� ���ڿ� ���� �Ҷ� ���

	public static void main(String[] args) {
		String javaStr = new String ("Java");
		System.out.println("JavaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("������ buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" program is fun!!");
		
		System.out.println("������ buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString ();		//buffer �� ���ڿ� ������ ���� javaStr �� �Ҵ�. 
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
				
	}

}
