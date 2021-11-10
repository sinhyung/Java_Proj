package Exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {		// AutoClose ���� ���� ����(����)
										// finally ���� fis.close() �޼ҵ� ȣ�� 
	public static void main(String[] args)  {
		
		FileInputStream fis = null;
		

			try {
				fis = new FileInputStream("C:\\test\\input.txt"); //FileNotFoundException
				
				System.out.println((char)fis.read());   //IOException
				System.out.println((char)fis.read()); //�ѱ��ڸ� �о ���ڷ� ���(����)
				System.out.println((char)fis.read()); 
			
			
				// IOException ������ FileNotFoundException �� �����Ѵ�. 
				// catch ����� ���� Exception�� ���� ó�� �ϰ�, ���� Exception�� ó�� 
				
			} catch (FileNotFoundException e) {
				System.out.println(e);
				//e.printStackTrace();
			} catch (IOException e) {
				System.out.println(e);
				//e.printStackTrace();
			} finally {
				
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
					//e.printStackTrace();
				}catch (NullPointerException e) {
					System.out.println(e);
				}
			}
			

			
			
	
		

	}

}
