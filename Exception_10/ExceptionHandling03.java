package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {

	public static void main(String[] args) { //finally{} ����� ��ü�� ����
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("e.txt");
		} catch (FileNotFoundException e) {		// try{}������� ���ܰ� �߻��� catch{}����� �۵�
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch ��� �۵�");
		}
		finally {	// try{} ����� ���� �Ǹ� finally{}�� �ݵ�� ���� (���� �߻��� ������� �۵�)
			System.out.println("finally ��� ����");
			
			if ( fis != null) {
				try {
					fis.close();					//��ü�� �޸𸮿��� ���� (���� ó�����ؾ��Ѵ�.)
					System.out.println("��ü ���� �޸𸮿��� ���� ");
				} catch (IOException e) {
					System.out.println("��ü ���� �޸𸮿��� ���� �ȵ� (Null ");
					//e.printStackTrace();
				}		
			}
			
		}
		System.out.println("���α׷� ����");

	}

}
