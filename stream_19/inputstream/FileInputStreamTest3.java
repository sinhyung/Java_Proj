package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {	// A ~ Z : 26��
		
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while ( (i = fis.read(bs)) != -1 ){
				//���� for �� : ������ ���� �ڸ� ��� �ڿ� ���� �پ� �� �� �ִ�
				
				System.out.println("���� for �� ��� ");
				for (byte b : bs ) {
					System.out.print( (char) b);
				}
				
				System.out.println();
				
				System.out.println(" for ���� ����ؼ� ���");
				for (int k=0; k<i; k++) {
					System.out.print( (char) bs[k]);
				}
				
				System.out.println(" : " + i + " ����Ʈ ����. ");
				
			}
			
			
		}catch (IOException e) {
			
		}

	}

}
