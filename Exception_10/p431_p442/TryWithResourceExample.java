package Exception_10.p431_p442;		//sec05_try_with_resources;  07 P440

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();		// 강제로 Exception을 발생 시킴
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
