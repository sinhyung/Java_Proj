package lamda_14.stream;

import java.util.Arrays;

public class InArrayTest {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};			//�迭�� ��Ʈ�� ��� : Arrays.stream(arr) <== ��Ʈ������
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("���� ����� ���� : " + sum);
		
		System.out.println("==== ��Ʈ���� ���� �� ===");
		
		
		int sumVal = Arrays.stream(arr).sum();	//�迭�� ��� ���� ���� ��
		int count = (int) Arrays.stream(arr).count();	//�迭�� ���� ������ ����
		
		
		double avgVal = (double) Arrays.stream(arr).average().getAsDouble();		//�迭 ���� ��� ���� ����
		int minVal = (int) Arrays.stream(arr).min().getAsInt();
		int maxVal = (int) Arrays.stream(arr).max().getAsInt();
		
		System.out.println("�� : " + sumVal);
		System.out.println("���� ���� " + count);
		System.out.println("��հ� : " + avgVal);
		System.out.println("�ּҰ� : " + minVal);
		System.out.println("�ִ밪 : " + maxVal);
		
		

	}

}
