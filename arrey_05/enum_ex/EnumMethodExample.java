package arrey_05.enum_ex;

public class EnumMethodExample {

	public static void main(String[] args) {
		//Enum ������ Ÿ���� ����ϴ� ��ü�� java.lang.Enum Ŭ������ ��� �޴´�. 
			//java.lang.Enum Ŭ������ �޼ҵ带 ����� �� �ִ�. 
		//name() �޼ҵ� : ���� ��ü�� ������ �ִ� ���ڿ��� �����Ѵ�. 
		Week today = Week.SUNDAY;
		String name = today.name();  
		System.out.println(name);
		
		//ordinal() �޼ҵ� : ��ü ���� ��ü�� ���° ���� ��ü���� �˷��ش�. (�ε��� ��ȣ�� �˷���)	
					// 			
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ� : �Ű������� �־��� ���� ��ü�� �������� ���� ���°�� ��ġ�ϴ��� ��.
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		
		//valueOf() �޼ҵ� : �Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ����
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay  = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱��� ");
			}else {
				System.out.println("���� �̱���. ");
			}
		}
		/*
		String arg0 = args[0] ; 
		String arg1 = args[1] ; 
		String arg2 = args[2] ;
		String arg3 = args[3] ;
		System.out.print( arg0 + " " + arg1 + " " + arg2 + " " + arg3 );
		*/
		
		//values() �޼ҵ� : ��� ���� ��ü���� �迭�� ����� �����Ѵ�. 
		Week[] days = Week.values();
		for ( Week day : days) {
			System.out.println(day);
		}
		
	}

}
