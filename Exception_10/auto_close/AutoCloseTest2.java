package Exception_10.auto_close;

public class AutoCloseTest2 {   // 예외가 발생되는 경우 (close())

	public static void main(String[] args) {
		
		try( AutoCloseObj obj = new AutoCloseObj() ) {
			
			throw new Exception();	// Exception 강제 발생 
		}
		catch (Exception e) {
			System.out.println("예외 처리 부분 입니다 ");		
		}
		System.out.println("프로그램 종료 ");
	}
}
  /*
	throw 	: Exception을 강제로 발생 시킴
	throws 	: Exception을 미루는 것 
*/