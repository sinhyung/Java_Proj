package ex;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];		// �迭 ���� 
		int num ;		// �迭�� ���� ����
		int sum = 0 ;	// �迭�� ������ ���� ���ϴ� ���� 
		
		System.out.println("���� ��� ��� �� ���? ");
		num = sc.nextInt();
		
		arr = new int [num]; 	// ���ɳʿ��� ��ǲ ���� �������� �迭 ��ũ��� ����
		
		for ( int i=0 ; i < arr.length ; i++) {
			arr[i] = (int) (Math.random() * 100 + 1 ); //�� �濡 ������ �������� ���� (1~10)
			sum += arr[i];  // sum = sum + arr[i]
		}
		for (int s : arr) {
			System.out.printf(s + " ");
		}
		
		double avg = (double) sum/arr.length ; // ����� �ݵ�� �Ǽ��� ��� 
		
		System.out.println( " �� ���� : " + sum + "�̰�, ����� : " + avg  );
		
	}

}
