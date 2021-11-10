package stream_19.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//FileWriter : �ܺ� ������ �������� ���� ��� ����, ����
		//FileReader : �ܺ� ������ ���� ���� �ʴ� ��� : NotFoundException �߻�
		
		FileWriter fw = new FileWriter ("writer.txt");
		
		fw.write('A');	//���� 1�ڸ� ���. ���� 1�ڸ� ó���Ҷ� 'A' 
			//�迭�� ���� �Ѳ����� ����, ���
		char [] buf = {'B','C','D','E','F','G'};
		fw.write(buf); // �迭�� ���� ���, �ܺ� ���Ͽ� ����
		fw.write("�ȳ��ϼ��� �ڹ����α׷��ð�~");		//���ڿ��� ���� " " �� ó��
		
		fw.write(buf, 1, 2);	//�迭�� �Ϻ� ���� ���
		fw.write("65");			//���ڸ� �״�� ���.
		fw.write(65);			//int ������ �����ϸ� ��Ű�ڵ��� ���ڰ� ��µ� A
		
		fw.close();
		
		System.out.println("���������� ��� �Ǿ����ϴ�");
		
		
		

	}

}
