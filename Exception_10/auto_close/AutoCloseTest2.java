package Exception_10.auto_close;

public class AutoCloseTest2 {   // ���ܰ� �߻��Ǵ� ��� (close())

	public static void main(String[] args) {
		
		try( AutoCloseObj obj = new AutoCloseObj() ) {
			
			throw new Exception();	// Exception ���� �߻� 
		}
		catch (Exception e) {
			System.out.println("���� ó�� �κ� �Դϴ� ");		
		}
		System.out.println("���α׷� ���� ");
	}
}
  /*
	throw 	: Exception�� ������ �߻� ��Ŵ
	throws 	: Exception�� �̷�� �� 
*/