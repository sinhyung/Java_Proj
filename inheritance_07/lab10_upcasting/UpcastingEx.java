package inheritance_07.lab10_upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p ;
		Student s = new Student("ȫ�浿");	//s�� Person,Student�� �ʵ�� �޼ҵ� ����
		
		p=s;		// ��ĳ����  Person p = new Student();
				//p�� Person�� �ʵ�� �޼ҵ常 ���� 
				// ��, �޼ҵ� �������̵��� �޼ҵ忡 ���������� �������ε������ؼ� �ڽ��� �޼ҵ带 ȣ�� 
			
		System.out.println(p.name);
		
		p.fly();	//���� ���ε� ����, �ڽ� Ŭ������ fly()�� ��� . 
		
		//p.grade = "A";		// ����
		//p.department ="Com" // ���� 
		
							
		
	}

}
