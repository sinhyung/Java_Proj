package stream_19.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {	//�ѱ��� ��� �������� ��µ�.
			//����Ʈ ��Ʈ��, �ѱ��� ��� ���ڰ� �� �������� ���, ������ ��� �ƽ�Ű �ڵ�� ����
			//�ѱ��� ��� ���� ��Ʈ������ ó��(FileReader), 2. ���� ��Ʈ������ ó��

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = null;
		fis = new FileInputStream("reader.txt");
		
		int i ;
		while( (i = fis.read())!= -1) {		// ������ ���������� ( -1 ): EOF 
			System.out.println((char) i);
		}
		
		fis.close();
		System.out.println("���α׷� ����");

	}

}
