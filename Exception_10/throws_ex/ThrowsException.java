package Exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {  // throws : ���ܸ� �̷�� �� , ȣ���ϴ� ������ ���� ó���� �ؾ���. 
	
	public Class loadClass (String fileName, String className) throws FileNotFoundException, ClassNotFoundException  {
		
		FileInputStream fis = new FileInputStream (fileName);
		Class c = Class.forName(className);		//Ŭ������ ��ü �̸��� �޾Ƽ� �����ϴ��� Ȯ�� 
		return c;		//Class.forName(��üŬ����) : �����ε��� ����, 
							//�����ε� : �����Ͻÿ� �̸��� Ȯ���ϴ� ���� �ƴ϶� ����ÿ� �̸� Ȯ��. 	
	}

	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();	//throws Exception�� ó���� ��ü ���� 
/*				
		try {   // Multi catch : �ΰ��� Exception�� ���ؼ� �ϳ��� ó�� 
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}

*/		
	
		
		try { // Surround catch : ������ Exception�� ���ؼ� ���� ó��  
				test.loadClass("C:\\test\\b.txt", "java.lang.String22222");

		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("������ �����ϴ�.");
		
		} catch (ClassNotFoundException e) {		//���� �ε��� ���� �Ǿ ���߿� Ȯ����
			System.out.println(e);
			System.out.println("Ŭ���� ������ �����ϴ�. ");
		}
		System.out.println("���α׷� ����");
		
		

			
			
	}
}
