package generic_12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {		//�̸��� 4�� �Է� �޾� ArrayList�� ���� �ϰ� ���� ���̸��� ��� 

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner (System.in);
		
		// 4���� �̸��� �Է� �޾Ƽ� ArrayList�� ����
		for ( int i = 0 ; i < 4 ; i++) {
			System.out.println("�̸��� �Է� �ϼ���.");
			String s = scanner.next(); 				// ��ĳ�ʿ��� �̸� �Է�
			a.add(s);								// ArrayList�� ����
		}
		// ArrayList�� ����� ��� �̸��� ���
		for (int i = 0 ; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
			System.out.println();
		}
		// ���� ���̸��� ��� 
		int longnameindex = 0 ;		// ���� ���̸��� ���� �̸��� ���ȣ 
		for (int i=0 ; i < a.size(); i++ ) {
			if ( a.get(longnameindex).length() < a.get(i).length()) {
				longnameindex = i ; 
			}
		}
		System.out.println("���� �� �̸��� : " + a.get(longnameindex));
		System.out.println("===�� ���� ���� ���̴�============");
		System.out.println( a.get(0) + " : 0 ������ ���� ���̴� " + a.get(0).length());
		System.out.println( a.get(1) + " : 1 ������ ���� ���̴� " + a.get(1).length());
		System.out.println( a.get(2) + " : 2 ������ ���� ���̴� " + a.get(2).length());
		System.out.println( a.get(3) + " : 3 ������ ���� ���̴� " + a.get(3).length());
	}

}
