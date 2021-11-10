package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling01 {	// try {} catch{} finally{}

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			//fis = new FileInputStream("c.txt");		//��Ŭ������ ������Ʈ ����
			fis = new FileInputStream("C:\\test\\c.txt"); 
		} catch (FileNotFoundException e) {		// try{}������� ���ܰ� �߻��� catch{}����� �۵�
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch ��� �۵�");
		}
		finally {	// try{} ����� ���� �Ǹ� finally{}�� �ݵ�� ���� (���� �߻��� ������� �۵�)
			System.out.println("finally ��� ����");			
		}
		System.out.println("���α׷� ����");
	}

}
