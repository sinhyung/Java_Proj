package lamda_14.lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		
		//���� �����ڿ� ���ٽ��� ����ؼ� Max ���� ��� 
		
		MyNumber max = ( x,y ) -> ( x >= y) ? x:y;	//���ٽ��� �������̽� �ڷ��� max ������ ����
		System.out.println(max.getMax(10, 20));		//�������̽� �ڷ��� ������ �Լ� ȣ��
		
		//���� �����ڿ� ���ٽ��� �̿��ؼ� �ּҰ� ���
		MyNumber2 min = (x,y) -> (x <= y ) ? x:y;
		System.out.println(min.getMin(10, 20));
		
		

	}

}
