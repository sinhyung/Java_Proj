package Exception_10.auto_close;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ���  close(), ���� �Ǿ����ϴ�. ");
		
	}	
							//�ڵ����� ��ü�� ���� �ҷ��� AutoCloseable �������̽��� ���� �ؾ��Ѵ�.
							// close() �޼ҵ带 �������̵�(������) ���� �ؾ� �Ѵ�. 
							// try width resource ������ ��� 
	
	

}
