package ex;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// ȯ���� ���� ����, �迭�� ����
		int money;	// ��ǲ �޴� ���� �׼� 
		System.out.println(" �ݾ��� �Է��ϼ���. >>>");
		money = sc.nextInt();
		
		for (int i=0 ; i < unit.length; i++) {
			
			System.out.printf(" %d �� ¥�� : %d �� \n", unit[i], money/unit[i]);
			money = money - ( money / unit[i]) * unit[i];	// �� ���� ������ ȯ���� ���� �ٽ�	
		}													// �ӴϿ� �����ϰ�, ���� �迭���� �ٽ�
															// ȯ���ؼ� �ٽ� �ӴϿ� �����Ѵ�. 
		
		sc.close(); // Scanner �� ����� ����
		
	}

}
