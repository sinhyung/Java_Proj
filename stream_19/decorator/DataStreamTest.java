package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream ("C:\\Temp\\date.txt");
		FileInputStream fis = new FileInputStream("C:\\Temp\\data.txt");
		
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		
			//�پ��� ������ �ڷ����� ó��, ���� : �ƿ�ǲ �ڷ���, ��ǲ�ڷ��� 
			//����Ŭ (MS-SQL-, My-SQL) => HTML,CSS,JavaScript, JSP, Spring, ����Ʈ, ���̽�
			// ppt <== ������ ������ ���� ����
		
		
		dos.writeByte(100); 	//byte ���
		dos.writeChar('A');		//char �ڷ����� ���
		dos.write(10);			//int ���
		dos.writeFloat(3.14F); 	//Float ���
		dos.writeDouble(3.14159); 	//Double���	 
		dos.writeUTF("�ȳ��ϼ���");	//String�� ó��
		System.out.println("��� �Ϸ� < == �ܺ� ���Ͽ� ���� ");
		
		
		System.out.println("===�����ؼ� ���=====");
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
		
		
		

	}

}
