package lamda_14.lamda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//1. ��ü �������� ��� : ��ü�� �޼ҵ�� ȣ�� // ����Ŭ���� ���� , ������ ��� 
				//���ٽ��� �͸� ���� Ŭ������ �۵��� ��.
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("==1. ��ü�������� ����ϴ� ���===");
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2); //���ٽ����� �����ִ� ����
		
		
		
		//2. ���ٽ��� ����ؼ� ��� // ����Ŭ���� ���� �۵��� �� // �ӽ��� ��� 
		
		System.out.println("==2. ���ٽ��� ����ؼ� ��� �ϴ� ���==");
		StringConcat concat2 = (s, v) -> System.out.println(s + " , " + v);
		concat2.makeString(s1, s2);	// ���ٽ����� ���� �ִ� ����
		
		//3. �͸� ���� Ŭ������ ����ؼ� ���. //����Ŭ������ ���� ���ο��� ���� // �ӽ��� ��� 
		
		System.out.println("==2. �͸� ���� Ŭ������ ����ؼ� ����ϴ� ���===");
		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " , " + s2);
			}
		};
		
		concat3.makeString(s1, s2);			//�͸� ���� Ŭ���� ȣ��
	}

}
