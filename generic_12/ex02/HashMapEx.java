package generic_12.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {	// �ܾ� �˻��� ( ����, �ѱ� )�� �ؽ��ʿ� �����ϰ� ��� �־����� �ѱ��� ���

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>(); 
		Scanner sc = new Scanner (System.in);
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// ���� �ܾ ������ �ѱ� �ܾ �˻�, "exit"�� �Է� ������ ����.
		while(true) {
			System.out.println("ã�� ���� �ܾ�� ? ");
			String eng = sc.next();
			if ( eng.equals("exit")) {
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			}
		// HashMap���� ���� ���� �ش� �ϴ� �ѱ��� �˻� 	
			String kor = dic.get(eng);		//�������� ������ �˻��ؼ� �ѱ۰��� ���� 
			if (kor == null) {
				System.out.println("�˻� ����� �����ϴ�.");
			}else {
				System.out.println(kor);
			}			
		}
		sc.close();

	}

}
