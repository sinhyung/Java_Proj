package inheritance_07.abstract_calc;

public class GoodCalc extends Calculator {    // Calculator Ŭ������ �߻�޼ҵ�(����)==> ����

	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) {	//�迭�� ���� �Ҵ� �޾Ƽ� ����� ���� 
		double sum = 0;
		for (int i=0 ; i < a.length ; i++) {
			sum += a[i];     // sum = sum + a[i]
		}		
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		int[] cc = {4,5,6,7,8,9};				// ������ �迭�� ���� �Ҵ� 
		int[] dd = new int[5];
		dd[0] = 30;
		dd[1] = 40;
		dd[2] = 50; 
		dd[3] = 60;
		dd[4] = 70;
		System.out.println(c.add(2, 3));	//
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));	// �޼ҵ� ȣ��ο� �迭�� ����
		System.out.println(c.average(cc));
		System.out.println(c.average(dd));
		System.out.println(c.times(cc));

	}
	@Override
	public int times(int[] b) {
		int t=1;
		for (int i =0 ; i < b.length; i++) {
			t *= b[i];
		}
		return t;
	}



}
