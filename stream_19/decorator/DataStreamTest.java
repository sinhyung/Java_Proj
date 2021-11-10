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
		
			//다양한 형식의 자료형을 처리, 주의 : 아웃풋 자료형, 인풋자료형 
			//오라클 (MS-SQL-, My-SQL) => HTML,CSS,JavaScript, JSP, Spring, 리엑트, 파이썬
			// ppt <== 다음주 월요일 까지 제출
		
		
		dos.writeByte(100); 	//byte 출력
		dos.writeChar('A');		//char 자료형을 출력
		dos.write(10);			//int 출력
		dos.writeFloat(3.14F); 	//Float 출력
		dos.writeDouble(3.14159); 	//Double출력	 
		dos.writeUTF("안녕하세요");	//String을 처리
		System.out.println("출력 완료 < == 외부 파일에 저자 ");
		
		
		System.out.println("===인폿해서 출력=====");
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
		
		
		

	}

}
