package inheritance_07.lab10_downcasting;
public class DowncastingEx02 {
	public static void main(String[] args) {
		Student s ;		// ��ü ���� (�ν��Ͻ� ����) ���� : s	
		Person p ;		// ��ü ���� (�ν��Ͻ� ����) ���� : p	
		
		s = new Student ("ȫ�浿");	//��ü ����
		System.out.println("=====��ĳ���� =========");		
		 p = s ;			// ��ĳ���� : ���� ����ŸŸ���� ������ �� �ִ�. 
		//p = (Person) s ; 	
		 p.id = "2000"; p.name = "���ڹ�";
		 	p.fly();	//�������̵��� �޼ҵ� ȣ��
		 
		 System.out.println("========�ٿ�ĳ����===============");
		
		s = (Student)p ;    // �ٿ� ĳ���� :  ����Ÿ Ÿ���� ��������� ����ؾ� �Ѵ�. 
		s.id = "3000"; s.name = "ȫ�ڹ�"; s.grade = "4"; s.department = "sales";
			s.fly();	// �������̵��� �޼ҵ� ȣ��
	
		
	}

}
