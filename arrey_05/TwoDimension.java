package arrey_05;
public class TwoDimension {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6}};	// 2���� �迭 ����� �ʱ�ȭ 
		
		for (int i=0 ; i < arr.length; i++ ) { // ���� ���� , 
									//arr.length : 1���� �迭�϶�-��, 2���� �迭�϶�-��
									//arr[0].length : ���� ���ؽ� ��ȣ��  ���� ���
			for ( int j=0 ; j < arr[i].length; j++) { //���� ����

				System.out.println( arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[0].length : " + arr[0].length);	
		arr [1][2] = 300;				// �迭 �濡 ���� �Ҵ�. 
		System.out.println(arr[1][2]);	// �迭 ���� ���� ��� 
	}

}
