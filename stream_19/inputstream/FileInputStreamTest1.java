package stream_19.inputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//FileInputStream fis = new FileInputStream("input.txt");
								//��Ŭ������ ������Ʈ �Ʒ�
		//FileInputStream fis = FileInputStream("D:\\Temp\\input.txt")
		
		
		
		FileInputStream fis = null;
		
		try {
		//fis = new FileInputStream ("input.txt");	//�ݵ�� ����ó��
		fis = new FileInputStream("D:\\Temp\\input.txt");
			
		System.out.println((char)fis.read());	//1����Ʈ�� �о�ͼ� ���
		System.out.println((char)fis.read());	//1����Ʈ�� �о�ͼ� ���
		System.out.println((char)fis.read());	//1����Ʈ�� �о�ͼ� ���
		

	}catch(IOException e) {	//IOException�� FileNotFoundException �� ���� Excetion
		System.out.println(e);
		//e.printStackTrace();
	}finally {
		
		try {
			fis.close();		//�ݵ�� ���� ó��
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} 
	}
		System.out.println("end (���α׷�����");
		
	}

}
