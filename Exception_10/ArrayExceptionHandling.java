package Exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];		// �迭�� �� 5�� ���� 
		
		for (int i =0 ; i <= 5 ; i++) { // Exception �߻�. �迭�� ���ȣ�� �Ѱ� ����.
									//ArrayIndexOutOfBoundsException: �迭�� ���ȣ�� �Ѱܹ������� �߻�
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		System.out.println("���α׷� ��������");
	}
}
