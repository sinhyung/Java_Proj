package arrey_05.twodemension;
public class ScoreAverage {
	public static void main(String[] args) {
		// 2���� �迭�� �г��� �� �б⺰(1�б�,2�б�)�� ������ ���� �ϰ�, 4�Ⱓ ��ü ���� ����� ����
		double score[][] = 
			{ {3.3, 3.4},	//1�г� (1�б�,2�б�)
			  {3.5,3.6},	//2�г� (1�б�,2�б�)
			  {3.7,4.0},	//3�г� (1�б�,2�б�)
			  {4.1,4.2}  }; //4�г� (1�б�,2�б�)
		double sum = 0;
		for (int year=0 ; year < score.length; year++ ) { //���� ����
			for ( int term = 0 ; term < score[year].length ; term++) { //��
				sum += score [year][term];   //��ü ������ ��
			}
		}
		int n = score.length;		// ���� ���� : 4
		int m = score[0].length;	// ���� ���� : 2
		System.out.println("4�г� ��ü ������ ���� : " + sum);
		System.out.println("4�г� ��ü ��� : " + sum / (n*m));

	}

}
