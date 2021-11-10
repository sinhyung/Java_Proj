package stream_19.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("D:\\Temp\\output.txt");
		file.createNewFile();	// 파일을 생성
		
		
		try (FileOutputStream fos = new FileOutputStream ("D:\\Temp\\output.txt")){
			
			fos.write(65);	//A
			fos.write(65);	//B
			fos.write(65);	//C
			
			
			
			
			
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("출력이 완료 되었습니다");
		

	}

}
