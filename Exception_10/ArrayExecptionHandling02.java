package Exception_10;

public class ArrayExecptionHandling02 {

	public static void main(String[] args) {// try���� ���ܰ� �߻����� ���� ��� catch ����� �۵����� 
		int[] arr = new int[5]; 				// �ʴ´�. 
		
		try {	
			for (int i=0 ; i < 5 ; i++) {
				arr[i] = i;					// ���濡 ���� �߰� 
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);			// �����ڵ带 ����ض� 
			System.out.println("���� ó�� �κ�");
		}
		System.out.println("���α׷� ���� ����");	
	}

}
