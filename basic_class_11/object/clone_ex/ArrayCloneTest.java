package basic_class_11.object.clone_ex;

public class ArrayCloneTest {	//�迭 ���� . 

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 ;
		
		arr2 = arr1.clone();
		
		System.out.println("����� arr2 �迭");
		for ( int num : arr2) {
			System.out.println(num + " ");
		}
		System.out.println();
		arr2[3] = 0 ;	//arr2�� ��� ����
		System.out.println("������ arr1 �迭");
		for ( int num : arr1) {
			System.out.println(num + " ");
		}
		System.out.println();
		System.out.println("������ arr2 �迭");
		for ( int num : arr2) {
			System.out.println(num + " ");
		}
		
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));

	}

}
