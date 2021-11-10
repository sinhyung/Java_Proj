package basic_class_11.garbage_collector;

public class Counter {
		// Garbage Collector (������ �÷���) : �޸��� ������(������� �ʴ� ��ü) û��. System.gc(); 
		// JAVA�� �������� JVM�� �ڵ����� û���� �ش�. cpu ���� �Ҷ�.  
	//finalize() �޼ҵ� : ������ �÷��Ͱ� û���ϱ����� ȣ�� �Ǵ� �޼ҵ� 
		//��ü �Ҹ� ������ ȣ��Ǵ� �޼ҵ� 
		//��ü �Ҹ��� (������ �÷���)�� ��ü�� �Ҹ� �ϱ� ���� finalize() �޼ҵ带 ȣ�� 
	private int no;
	public Counter(int no) {
		this.no =no;
	}
	@Override
	protected void finalize() throws Throwable {	// ��ü�� ���� �ɶ� ȣ��
		System.out.println( no + "��°�� finalize() �� ����� (��ü �Ҹ��)");
	}
	
}
