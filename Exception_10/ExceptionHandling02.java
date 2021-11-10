package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling02 {	// catch {} ������ return; 
									// finally�� catch{} �۵��� �Ǹ� �ݵ�� return;�� ������� ���� 
									// return�� finally���Ŀ� �۵� . 
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("d.txt");
		} catch (FileNotFoundException e) {		// try{}������� ���ܰ� �߻��� catch{}����� �۵�
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch ��� �۵�");
			
			return;		// ���α׷� ������ ����. 
		}
		finally {	// try{} ����� ���� �Ǹ� finally{}�� �ݵ�� ���� (���� �߻��� ������� �۵�)
			System.out.println("finally ��� ����");			
		}
		System.out.println("���α׷� ����");
	}

}
