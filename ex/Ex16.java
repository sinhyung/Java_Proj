package ex;
import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���","�ȵ���̵�"};
		int score [] = { 95, 88, 76, 62, 55};
		String name ="";	// ���ɳʿ��� �Է��� �޵��� �ϴ� ����
		int i = 0 ; 
		
		while (true) {
			System.out.println("���� �̸��� �Է� �ϼ���. >>");
			name = sc.next();		// ���ڿ��� ��ǲ ������ next() �޼ҵ� ���.
			if (name.equals("�׸�")) break; //break;�� ������ while ���� ���� ���´�. 
			for (i=0 ; i < course.length; i++) {
				if (course[i].equals(name)) {	// 
					System.out.println( course[i] + "�� ������ " + score[i] + "�Դϴ�. ");
					break;
				}
			}
			if (i== course.length) {
				System.out.println("���� ���� �Դϴ�. ");
			}			
		}
		System.out.println("while ���� ���� ���Խ��ϴ�. ");
		sc.close();
		
	}

}
