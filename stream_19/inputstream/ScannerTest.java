package stream_19.inputstream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
				System.out.println("�̸� : " ) ;
				String name = scanner.nextLine();	//String ����Ÿ�� ��ǲ ����
				System.out.println("���� : " );
				String job = scanner.nextLine();
				System.out.println("���� : " );
				int age = scanner.nextInt();
				System.out.println("�簢���� ���� ����(������) :");
				double width = scanner.nextDouble();
				
				System.out.println("=====��� ���=====");
				System.out.println(name);
				System.out.println(job);
				System.out.println(age);
				System.out.println(width);
				
				
				
				
	}

}
