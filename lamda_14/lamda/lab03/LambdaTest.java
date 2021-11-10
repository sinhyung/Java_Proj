package lamda_14.lamda.lab03;

@FunctionalInterface
interface PrintString{	//���ٽ��� ����ó�� ��� (1. ������ ������, 2. ��ǲ �Ű����� , 3. �����Ҷ� 
	
	void showString(String str);			//
	
	
}

public class LambdaTest {
	
	public static void showMyString (PrintString p) {
		p.showString("Hello Lambda2_02");
	}
	public static PrintString returnString() {
		return s -> System.out.println(s + "World" );
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("==1. ���ٽ��� ������ ����===");
		
		PrintString lambdaStr = s -> System.out.println(s);	//
		lambdaStr.showString("Hello Lambda_01");

		System.out.println("==2. �޼ҵ��� �Ű������� ����");
		showMyString(lambdaStr);
		
		System.out.println("==3. ���� ������ ���ٽ��� ���==");
		PrintString reStr = returnString ();
		reStr.showString("Hello");
		
		
		
		
		

		
		
	}

}
