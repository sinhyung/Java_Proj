package ex;
public class Ex15 {
	public static void main(String[] args) {
		int a, b ; 			// a = 10�� �ڸ�, b = 1�� �ڸ�
		
		for (int i = 1 ; i < 100 ; i++) {
			a = i/10 ;		// 10�� �ڸ��� ó��	
			b = i%10 ; 		// 1�� �ڸ��� ó�� 
			if (( a == 3 || a==6 || a==9) && (b==3 || b==6 || b==9 )){
				System.out.println( i + "�ڼ� ¦¦");
			}else if  (( a==3 || a==6|| a==9)&& (b !=3 || b!=6 || b!=9)){
				System.out.println(i + "�ڼ� ¦");
			}else if ((a !=3 || a!=6 || a!=9) && ( b==3 || b==6 || b==9 )) {
				System.out.println(i + "�ڼ� ¦");
			}			
		}
	}
}
