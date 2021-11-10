package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {	//BufferedStream�� ����ؼ� ���� 8KBó�� ���縦 ������

	public static void main(String[] args) throws IOException {
		//D:\Temp\a.exe	==> D:\Temp\c.exe < == BufferedStream �� ��� (RAM 8KBbye ó��)
		//BufferdStream : ������Ʈ��, RAM���, 8KB ó��
		
		FileInputStream fis = new FileInputStream ("C:\\Temp\\a.exe");		//��ݽ�Ʈ�� (��ǲ
		FileOutputStream fos = new FileOutputStream ("C:\\Temp\\c.exe");	//��ݽ�Ʈ�� (�ƿ�ǲ
		
		BufferedInputStream bis = new BufferedInputStream (fis);	//������Ʈ�� (��ǲ
		BufferedOutputStream bos = new BufferedOutputStream (fos); // ������Ʈ�� (�ƿ�ǲ
		
		
		long millisecond = 0;
		millisecond = System.currentTimeMillis();	//�������� �ý��� �ð��� �и������� ������ ����
		int i;
		while ( (i = bis.read ()) != -1) {	//8KB �б�
			bos.write(i);					//8kb ����
			
			
		}
		millisecond = System.currentTimeMillis() - millisecond;	//��ü ���� �ð�
		
		System.out.println("�� ���� �ð��� : " + millisecond + "�и������� �Դϴ�");
		
		

	}

}
