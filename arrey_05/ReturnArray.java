package arrey_05;
public class ReturnArray {
	
	static int[] makeArray() {
		int temp[] = new int[4];		// ������ �迭 �� 4�� ����
		for ( int i=0 ; i<temp.length; i++) { // for ���� ����ؼ� ���濡 �������� �Ҵ�. 
			temp[i] = i; 	// �迭�� ���濡 �� : 0,1,2,3
		}		
		return temp;
	}
	public static void main(String[] args) {
		//int intArray[];
		int[] intArray;
		intArray = makeArray();	//�޼ҵ�� ���� �迭�� ���� ����. 
		for ( int i = 0 ; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("==========================");
		intArray [0] = 50;
		intArray [1] = 60;
		intArray [2] = 70;
		intArray [3] = 80;
		
		for (int a : intArray) {
			System.out.print(a + " ");
		}					
	}
}


// P 154, ArrayCreateValueListExample.java
// P 157, ArrayCreateByNewExample.java
// P 158, ArrayLengthExample.java 




