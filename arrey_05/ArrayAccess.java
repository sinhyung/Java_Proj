package arrey_05;
import java.util.Scanner;
public class ArrayAccess {  //���� ���� 5���� �Է� �޾Ƽ� �迭�� �����ϰ� ���� ū���� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("���� ���� 5���� �Է� �ϼ��� >>");
		for (int i =0 ; i < intArray.length ; i++) {
			intArray[i] = scanner.nextInt(); 
			
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println( " ���� ū ���� " + max + "�Դϴ�. ");
		scanner.close();
	}
}
