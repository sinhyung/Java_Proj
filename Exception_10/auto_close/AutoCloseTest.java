package Exception_10.auto_close;

public class AutoCloseTest {		// ���ܰ� �߻����� �ʴ� ��� (���� ó��)

	public static void main(String[] args) {  // try (resource) {} : �ڵ��� close()

		try ( AutoCloseObj ojb = new AutoCloseObj() ) {
			
		}
		catch (Exception e){
			System.out.println("���� ��� �Դϴ�. ");
		}
		System.out.println("���α׷� ����");
	}

}
