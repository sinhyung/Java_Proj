package ex.chap05;
import java.util.Scanner;
public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;			//���� ������ ����
		int studentNum = 0 ;
		int [] scores = null;
		Scanner scanner = new Scanner ( System.in);
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. �л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("=================================================");
			System.out.println("���� >");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo ==1 ) {	// �л����� �Է� �ް�, �迭�� ũ�⸦ �Է� ���� �л����� ����. 
				//�ۼ���ġ
				System.out.println ("�л��� �Է� >");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) { //������ �迭 �濡 �л����������� �Է� 
				// �ۼ���ġ
				for ( int i =0 ; i< scores.length; i++) {
					System.out.println("scores[" + i + "] :  " );
					scores[i] = scanner.nextInt();
				}
				
			}else if (selectNo == 3 ) {
				//�ۼ���ġ
				for (int i =0 ; i <scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}else if (selectNo == 4 ) {
				// �ۼ� ��ġ
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0 ; i < scores.length; i++) {
					max = (max <scores[i] ) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum/studentNum;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				
				
			}else if (selectNo == 5 ) {
				// �ۼ� ��ġ
				run = false;
			}
		}
				
		System.out.println("���α׷� ����");
	}

}
