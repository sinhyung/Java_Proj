package Exception_10.p431_p442;		//sec05_try_with_resources;  07 P440

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();		// ������ Exception�� �߻� ��Ŵ
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
