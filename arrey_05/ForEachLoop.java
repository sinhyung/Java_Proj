package arrey_05;

public class ForEachLoop { // ���� For �� (Enhanced FOR)
							//�迭�� ó������ ������ ���� ��ȯ�ϸ鼭 ���� ��� �� ��� 

	public static void main(String[] args) {
		String[] strArr = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for ( int i=0 ; i < 3  ; i++) {		// ������ ����ؼ� Ư�� �������� ��� 
			System.out.println(strArr[i]);
		}
		System.out.println("========Enhanced For==========");
		
		for ( String lang : strArr) {
			System.out.println(lang);
		}
		
		
	}

}
