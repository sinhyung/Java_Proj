package Exception_10;

import java.io.FileInputStream;

public class FileNotFoundException {	// FileNotFoundException : ������ ��η� ã���� ���� ��� ���� 

	public static void main(String[] args) {
		FileInputStream fis = null;		// ���Ͽ��� ���� �о���� ��Ʈ�� 
		
		try {
		fis = new FileInputStream ("a.txt");
		}
		catch (Exception e){
			System.out.println(e);		//���� ������ ����϶� 
			System.out.println("���� �߻��� ");
		}
		System.out.println("���α׷� ���� ���� ");

	}

}
