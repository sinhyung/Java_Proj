package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {  //

	public static void main(String[] args) {
		
		try (FileInpustStream fis = new FileInputStream("input2.txt")) {//
				//try with resource, Finally에 close를 자동으로 처리
				//FileInputStream은 AutoCloseable 인터페이스의 close() 메소드를 재정의 했다.
			
			
			int i;
			while (i = fis.read() != -1 ) {		//파일의 마지막 끝까지 읽어 온다. // IOException
				System.out.println((char)i);
			}

		}catch (FileNotFoundException a) {
			//e.printStackTrace();
		}

	}

}
