package Exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {	// AutoClose �� ����ؼ� ��ü ����. 

	public static void main(String[] args) {
		
			//FileInputStream�� Closeable �������̽��� ���� �ϰ� �ִ�. 
		
		try ( FileInputStream fis = new FileInputStream ("C:\\test\\input01.txt") ){
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		}
		
		System.out.println("���α׷� ����");

	}

}
