package lamda_14.lamda.lab01;

import java.util.Scanner;

public class ArithmmeticOperationTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("첫번째 값을 넣으세요");
		double a = sc.nextDouble();
		System.out.println("두번째 값을 넣으세요");
		double b = sc.nextDouble();
		
		
		
		System.out.println("1. 객체 지향으로 출력 하기 ");
		ArithmeticOperationComp comp01 = new ArithmeticOperationComp();
		comp01.ArithmeticOper(a,b);
		
		System.out.println("2. 람다식 출력 하기 ");
		Arith
		System.out.println("3. 익명 내부 객체로 출력 하기 ");
		
	}

}
