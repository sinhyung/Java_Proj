package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExcep {
		// ���� ó�� :  1. throws�� ó�� : ���ܸ� �̷�� �� 
					//2. try ~ catch : 
	public static void main(String[] args)  {
		FileInputStream fis = null ; 
		
		try {
			fis = new FileInputStream ("b.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);  // ���� ������ ��� : ������ 
			e.printStackTrace();	// ���� ������ ��� : ���� �ڼ��� 
			System.out.println("catch ��� ȣ��");
		}
		System.out.println("���α׷� ����");
	}
}

// P 424 : ArrayIndexOutOfBoundsExceptionExample.java : ���� ó�� ���� ( Try Catch ) 






