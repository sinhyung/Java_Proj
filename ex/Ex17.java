package ex;
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"����", "����", "��"};
		String userSelect, comSelect;	
		int n ;		// ramdom �Լ����� �߻��ϴ� ���� ����, ��ǻ�Ͱ� ���� ��. 
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�. ");
		do {
			System.out.println("���� , ����, �� >> ");
			userSelect = sc.next();
			if ( userSelect.equals("�׸�")) break;
			n = (int) ( Math.random() * 3 ); 	// ��ǻ�Ϳ��� ������ �� : 0, 1, 2 �� ���� 
			comSelect = str[n]; // ����[0], ���� [1], �� [2]
			if (userSelect.equals("����")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�");
					continue;	
				}
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �����ϴ�.");
					continue;
				}
				if (comSelect.equals("��")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				}
			}else if (userSelect.equals("����")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				}
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�.");
					continue;
				}
				if (comSelect.equals("��")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �����ϴ�.");
					continue;
				}
				
			}else if (userSelect.equals("��")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �����ϴ�.");
					continue;
				}
				if (comSelect.equals("����")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				}
				if (comSelect.equals("��")) {
					System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�.");
					continue;
				}
			}
						
			// System.out.println("����� = " + userSelect + " , ��ǻ�� = " + comSelect);
					
		}while (true);
		System.out.println("������ ���� �մϴ�. ");
		sc.close();				
	}
}

// P 182 , ���� 8 ��, <<���� 9��>> 
// p 280, ���� 15, 16, 17, 18, ���� 19, << ���� 20>>


















