package stream_19.inputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//FileInputStream fis = new FileInputStream("input.txt");
								//이클립스의 프로젝트 아래
		//FileInputStream fis = FileInputStream("D:\\Temp\\input.txt")
		
		
		
		FileInputStream fis = null;
		
		try {
		//fis = new FileInputStream ("input.txt");	//반드시 예외처리
		fis = new FileInputStream("D:\\Temp\\input.txt");
			
		System.out.println((char)fis.read());	//1바이트를 읽어와서 출력
		System.out.println((char)fis.read());	//1바이트를 읽어와서 출력
		System.out.println((char)fis.read());	//1바이트를 읽어와서 출력
		

	}catch(IOException e) {	//IOException은 FileNotFoundException 의 상위 Excetion
		System.out.println(e);
		//e.printStackTrace();
	}finally {
		
		try {
			fis.close();		//반드시 예외 처리
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} 
	}
		System.out.println("end (프로그램종료");
		
	}

}
