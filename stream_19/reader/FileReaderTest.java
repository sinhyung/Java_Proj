package stream_19.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {	// ���ڽ�Ʈ��, �����ڵ�(�ѱ�, �Ϻ���, �߱���) �����͸� ó��

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader( "reader.txt");
		int i;
		while ( (i = fr.read()) != -1) {
			System.out.println((char) i);
			
		}
		fr.close();
		
		System.out.println("���α׷� ����");

	}

}
