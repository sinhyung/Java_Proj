package ex;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	//���ɳ� ��ü ����
		int[] arr = new int[10];		// arr �迭 ������ ���� �� 10 ���� �޴� �迭 ���� ����
		
		System.out.println(" ���� ���� 10 ���� �Է� �ϼ���. �������� ���� >> "); // ���ڿ� ���. 
		
		for ( int i = 0 ; i< arr.length ; i++) {	// ��ǲ���� ���� 10����  �迭�� �� �濡 ���� 
			arr[i] = scanner.nextInt();
		}
		System.out.println("3�� ����� ���� ? ");  // for ���� ����ؼ� ������ ������ ���� n%3 ==0
		
		for (int i =0 ; i< arr.length ; i++) {
			if (arr[i] % 3 == 0) {		// arr�� ������ 3���� ���������� �������� 0 �̶�� ���
				System.out.print(arr[i] + " ");
			}
		}				
	}
}
