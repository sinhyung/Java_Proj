package arrey_05;

public class ArrayCopy {	// �迭�� ���� , �迭�� �ʱ⿡ �迭���� ������ ����ǰ� �ڵ����� �þ�� �ʽ��ϴ�. 
							// �迭�� �� ���� ������ �ֱ����ؼ��� ���ο� �迭�� ����� ���� �迭�� ���� ����. 

	public static void main(String[] args) {
		int[] array1	= {10,20,30,40,50};
		int[] array2	= {1,2,3,4,5};
		int[] array3	= new int[10];	// ���ο� �迭�� �� 10�� ����
		int[] array4	= new int[20];
		
		System.arraycopy(array1, 0, array2, 1, 4);	// (<�����ҿ���>,<�����ּ�>,<�����Ҵ��>,<����ּ�>,<�����Ұ���>)
		System.arraycopy(array2, 0, array3, 0, 5);
		System.arraycopy(array1, 2, array4, 0, 3);
		
		for (int i=0 ; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("==========================");
		for (int i=0 ; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		System.out.println("======================");
		array3 [5] = 500;
		array3 [6] = 600;
		array3 [7] = 700;
		for (int i=0 ; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		System.out.println("=================");
		for (int i=0 ; i< array4.length ; i++) {
			System.out.println(array4[i]);
		}
	}
}
