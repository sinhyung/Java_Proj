package arrey_05;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] data = new double[5];	//double �� �迭 ���� data �� ���� 5�� ���� 
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		System.out.println(data.length);   // �迭������ ���� ������ ��� 
		
		double sum = 0.0;
		double total = 1.0;
		
		for (int i=0 ; i < data.length; i++) {
			System.out.println(data[i]);
			sum += data[i];		//sum = sum + data[i]
		}
		System.out.println("�� ���� : " + sum);
		
		for (int i=0 ; i < 3 ; i++) {
			total *= data[i];			
		}
		System.out.println("�迭�� ������ ���� ����� " + total);
	}

}
