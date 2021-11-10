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
		
		try (FileOutputStream fos = new FileOutputStream("D:\\Temp\\output2.txt");) {	// java 9 ���� ���� �����Ǵ� ���
			byte[] bs = new byte[26]; 	//A ~ Z : 26�� 
			byte data = 65; // A
			
			for ( int i=0; i < bs.length; i++) {		//�迭�� A ~ Z ���� for ���� ����ؼ� 
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);	//�迭�� ���� �Ѳ����� ��� �ƿ�ǲ ��Ʈ���� ����ؼ� ���Ͽ� Ǯ��(����)
			
			
		}catch (IOException e) {
			
		}
		System.out.println("����� �Ϸ� �Ǿ����ϴ�");

	}

}
