package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {	//BufferedStream을 사용해서 복사 8KB처리 복사를 빨리함

	public static void main(String[] args) throws IOException {
		//D:\Temp\a.exe	==> D:\Temp\c.exe < == BufferedStream 을 사용 (RAM 8KBbye 처리)
		//BufferdStream : 보조스트림, RAM사용, 8KB 처리
		
		FileInputStream fis = new FileInputStream ("C:\\Temp\\a.exe");		//기반스트림 (인풋
		FileOutputStream fos = new FileOutputStream ("C:\\Temp\\c.exe");	//기반스트림 (아웃풋
		
		BufferedInputStream bis = new BufferedInputStream (fis);	//보조스트림 (인풋
		BufferedOutputStream bos = new BufferedOutputStream (fos); // 보조스트림 (아웃풋
		
		
		long millisecond = 0;
		millisecond = System.currentTimeMillis();	//복사전의 시스템 시간을 밀리세컨드 단위로 저장
		int i;
		while ( (i = bis.read ()) != -1) {	//8KB 읽기
			bos.write(i);					//8kb 쓰기
			
			
		}
		millisecond = System.currentTimeMillis() - millisecond;	//전체 복사 시간
		
		System.out.println("총 복사 시간은 : " + millisecond + "밀리세컨드 입니다");
		
		

	}

}
