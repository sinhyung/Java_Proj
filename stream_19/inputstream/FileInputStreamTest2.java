package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {  //

	public static void main(String[] args) {
		
		try (FileInpustStream fis = new FileInputStream("input2.txt")) {//
				//try with resource, Finally�� close�� �ڵ����� ó��
				//FileInputStream�� AutoCloseable �������̽��� close() �޼ҵ带 ������ �ߴ�.
			
			
			int i;
			while (i = fis.read() != -1 ) {		//������ ������ ������ �о� �´�. // IOException
				System.out.println((char)i);
			}

		}catch (FileNotFoundException a) {
			//e.printStackTrace();
		}

	}

}
