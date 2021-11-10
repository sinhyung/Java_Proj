package stream_19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File (" D:\\Temp\\newFile.txt");
				//File : ���� ����, �Ӽ��� �˷���.����
		file.createNewFile();	//������ ��ο� ������ ������ �ִ� File Ŭ������ createNewFile();
		
		System.out.println(file.isFile()); 	//������ ������ ��ο� �����ϸ� True, �ƴϸ� False;
		System.out.println(file.isDirectory());	//����(True), ����(False)
		System.out.println(file.getName());		//���� �̸��� �����´�
		System.out.println(file.getAbsolutePath());	// ������ ���� �Ǿ� �ִ� ���� ���� ��� ���
									//D:\\Temp\\newFile.txt
		
									// ���� ��� : 
									 	//Windows : c:\, d:\ 
										//Linux   :	/(��Ʈ)���� ��ΰ� ����
		System.out.println(file.getPath());
									// ��� ��� : Ư�� ������ �������� ���	: 
		
		System.out.println(file.canRead());		//���� ������ �ִ°�?
		System.out.println(file.canWrite());
		
		file.delete();		//������ ����� ������ ����
		
		System.out.println(file.isFile());
		
	}

}
