package arrey_05.enum_ex;

public class MainStringArrayArgument {// main() �޼ҵ忡 args ���ڷ� ���� ���� �ֱ�

	public static void main(String[] args) {
		if (args.length !=2 ) {
			System.out.println("���α׷��� ����");
			//System.out.println("java MainStringArrayArgument num1 num2");
			System.out.println (" �ݵ�� ������ 2���� arg ���ڷ� ��������. ��) 10 20 " );
			System.exit(0);   // ���α׷��� ���� ����. 
		}
		String StrNum1 = args[0];
		String StrNum2 = args[1];
		System.out.println( StrNum1 + StrNum2); // (���ڿ�)40 + (���ڿ�)50 = 4050 
		
		int num1 = Integer.parseInt(StrNum1); //���ڷε� ���ڿ��� ���������� Ÿ�� ��ȯ
		int num2 = Integer.parseInt(StrNum2); //���ڷε� ���ڿ��� ���������� Ÿ�� ��ȯ
		
		int result = num1 + num2 ;
		System.out.println("num 1 + num2 = " + result);
		
		
		Integer aa = 10 ;
		
		System.out.println(StrNum1.getClass().getSimpleName());
		System.out.println(StrNum1.getClass().getName());
		System.out.println(aa.getClass().getName());
		
		
	
		
	}

}
