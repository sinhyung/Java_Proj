package basic_class_11.wrapper;

public class Boxing_unBoxing {
			//AutoBoxing : �⺻�ڷ����� �����͸� ��ü�� ������ �Ҵ�. 
			//unBoxing : ��ü���� �ڷ����� �⺻ �ڷ������� ��� , num1.intValue()
			// JAVA 5.0 : AutoBoxing, unBoxing ���� 

	public static void main(String[] args) {
		
		Integer num1 = new Integer(100);	// num1�� ��ü��
		int num2 = 200 ; 					// num2�� �⺻ �ڷ��� 
		
		int sum = num1 + num2 ; //num1 �ڵ����� ��ڽ� , num1.intValue()
		int sum2 = num1.intValue() + num2;  //JAVA 5.0 ���� 
		
		Integer num3 = num2; // ���� �ڽ� : Integer.valueOf(num2)�� �ڵ� ��ȯ 
		Integer num4 = Integer.valueOf(num2);	// JAVA 5.0 ���� 
		
		
		
		
		System.out.println("sum : " + sum);		// ��ڽ����� ó��
		System.out.println("sum2 : " + sum2);
		
	}

}
