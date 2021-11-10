package ex.chap05.add;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise09 {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		boolean run = true;			//���� ������ ����
		int studentNum = 0 ;
		//int [] scores = null;
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
				//arr = new ArrayList<Student>(studentNum) ;	// ArrayList�� ��ũ�� ����
				System.out.println(" ArrayList ��ũ�� ���� �Ϸ�");
				System.out.println(arr.size());
				
			}else if(selectNo == 2) { //������ �迭 �濡 �л����� ������ �Է� 
				// �ۼ���ġ
				if (studentNum == 0 ) {
					System.out.println( "1���� ���� �ؼ� �л����� ���� �Է��ϼ���. >>");
				}else {
					System.out.println(" ������ �Է��ϼ���. ");
					for ( int i = 0 ; i < studentNum; i++) {
						Student student = new Student();
						System.out.println ( (i + 1) +" ��°�濡 ���� �Է�" );
						student.score = scanner.nextInt();
						arr.add(student);		// ArrayList�� ��ü�� ���� 						
						System.out.println("���� �Ϸ�");						
					}										
				}
				
			}else if (selectNo == 3 ) {
				//�ۼ���ġ
				for (int i =0 ; i <arr.size(); i++) {
					System.out.println("���ȣ[" + (i+1) + "] : " + arr.get(i).score);
				}
			}else if (selectNo == 4 ) {
				// �ۼ� ��ġ
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0 ; i < arr.size(); i++) {
					max = (max <arr.get(i).score ) ? arr.get(i).score : max;
					sum += arr.get(i).score;
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
