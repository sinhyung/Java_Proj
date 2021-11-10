package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	
	// D:\Temp\a.exe		==> D:\Temp\b.exe

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//FileInputStream : �٤���Ʈ ��Ʈ��. 1����Ʈ�� �о ó��
		FileInputStream fis = new FileInputStream ("C:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream( "C:\\Temp\\b.exe");
		
		long millisecond = 0;			//����Ǵ� ��ü �ð��� ��� (�и�������)
		millisecond = System.currentTimeMillis(); //������ �ð��� �и� ������ ������ ����
		
		int i ;
		int j=1;		//�� ����Ʈ
		while ( (i = fis.read()) != -1) {		//fis : ����, 1byte�� �д´�.
			fos.write(i);						//fos : ���, 1byte�� ����.
			
		}
		
		millisecond = System.currentTimeMillis() - millisecond;		//��ü ����ð�(�и�������)
		System.out.println("�����ϴµ� �ɸ��� �ð���" + millisecond + "�и������� �ҿ� �Ǿ����ϴ�");
		System.out.println("�� ������ ����Ʈ ����" + j + "�Դϴ�");		
		

	}

}
