package arrey_05;

public class ArrayTest3 {

	public static void main(String[] args) {
double[] data = new double[5];	//double �� �迭 ���� data �� ���� 5�� ���� 
		
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		System.out.println(data.length);   // �迭������ ���� ������ ��� 
		
		double sum = 0.0;
		double total = 1.0;
		
		for (int i=0 ; i < data.length; i++) {
			System.out.println(data[i]);
			sum += data[i];		//sum = sum + data[i]
		}
		System.out.println("�� ���� : " + sum);
		
		for (int i=0 ; i < size ; i++) {
			total *= data[i];			
		}
		System.out.println("�迭�� ������ ���� ����� " + total);
	}
	}


