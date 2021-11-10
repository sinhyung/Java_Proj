package Exception_10.EX;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc {
	int a;
	int b;
	public CompleteCalc (int a, int b ) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int add(int a, int b) {
		return a + b ;
	}

	@Override
	public int times(int a, int b) {
		return a * b ;
	}

	@Override
	int substract(int a, int b) {
		return a - b ;
	}

	@Override
	int divide(int a, int b) {
		return a / b ;
	}
	
	@Override
	public String toString() {
		return "���� : " + add (a,b) + " , ���� : " + substract(a,b) + " , ���Ѱ�" + times(a,b) + 
				" , ������" + divide(a,b);
	}

	public static void main(String[] args) {
			//Calc �������̽��� ���� , Calculator �߻�Ŭ������ ���� �մϴ�.  <<�Ϸ� �ð� : 4: 00��>>
			//��ĳ�ʷ� �ΰ��� ������ ��ǲ �޾Ƽ�, ��ü ��ü�� print ���� �� , 4Ģ ������ ��� ��� 
			// a / b : b�� 0�� ��� Exception �߻� , ArithmeticException
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		System.out.println("���� a ���� �������� > ");
		a = sc.nextInt();
		System.out.println("���� b ���� �������� > ");
		b = sc.nextInt();
		
		CompleteCalc calc = new CompleteCalc(a, b);
			System.out.println(calc.add(a, b));
			System.out.println(calc.substract(a, b));
			System.out.println(calc.times(a, b));
				
		try {
			System.out.println(calc);
		}
		catch (ArithmeticException e) {
			
		}
		
		System.out.println("���α׷� ����. ");
		
		/*
		int a = 10; 
		int b = 0 ; 
		
		int c = a / b;
		
		System.out.println(c);
		*/
		
		
	
	}

	

}
