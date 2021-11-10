package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		
		
		//FileInputStream : ��� ��Ʈ��. ����Ʈ ��Ʈ��. (�ѱ��� ��� �������� ��µ�)
		//InputStreamReader : ���� ��Ʈ��. ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ
		
		System.out.println("===�ѱ��� ��� ������(FileInputStream) ===");
		FileInputStream fis = new FileInputStream ("reader.txt");
		int i;
		while ( (i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		System.out.println();System.out.println();
		
		System.out.println("���� ��Ʈ��(InputStream) �� ����ؼ� �ѱ��� ��½�Ŵ");
		
		InputStreamReader isr = new InputStreamReader ( new FileInputStream("Reader.txt"));
			//������Ʈ�� ���� : ������ ���ο� ��� ��Ʈ�� , �ٸ�������Ʈ���� ����.
		int j;
		while ( (j = isr.read()) != -1){
			System.out.print( (char) j);
			
		}
	}

}
