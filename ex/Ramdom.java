package ex;

public class Ramdom {

	public static void main(String[] args) {
		
		
		int n = (int) ( Math.random() * 3) ;	//0, 1, 2 ���� ����� �ȴ�. 
		System.out.println(n);
				
		
		System.out.println("===========================");
		System.out.println(Math.random()); // 0.0xxxxxxxxxxxxx ~ 0.9xxxxxxxxxx
		System.out.println( Math.random() * 10 ); // 0.xxxxxxxxx ~ 9.xxxxxxxxxx
		System.out.println((int) Math.random()* 10);  // 0 ~ 9 
		System.out.println((int) Math.random() * 10 + 1 );   // 1 ~ 10 ������ ������ ���� ���
		System.out.println((int) Math.random() * 100 + 1 );  // 1 ~100 ����.

	}

}
