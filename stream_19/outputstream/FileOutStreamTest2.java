package stream_19.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("D:\\Temp\\output2.txt");
		file.createNewFile();
		
		
		//FileOutputStream fos = new FileOutputStream("D:\\Temp\\output2.txt");
		
		try (FileOutputStream fos = new FileOutputStream("D:\\Temp\\output2.txt");) {	// java 9 버전 부터 지원되는 기능
			byte[] bs = new byte[26]; 	//A ~ Z : 26자 
			byte data = 65; // A
			
			for ( int i=0; i < bs.length; i++) {		//배열의 A ~ Z 까지 for 문을 사용해서 
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);	//배열의 값을 한꺼번에 출력 아웃풋 스트림을 사용해서 파일에 풀력(저장)
			
			
		}catch (IOException e) {
			
		}
		System.out.println("출력이 완료 되었습니다");

	}

}
