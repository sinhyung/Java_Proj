package inheritance_07.lab10_downcasting;

public class DowncastingEx {
	public static void main(String[] args) {
		System.out.println("======��ĳ����=========");
		Person p = new Student("ȫ�浿");		//�� ĳ���� : �θ� Ŭ������ �ʵ�,�޼ҵ� ����
											//��. �������̵��� �޼ҵ� ȣ��� ���� ���ε� ����
		p.id = "1000";
		System.out.println(p.id + "," + p.name);  //p : �θ�Ŭ������ �ʵ�, �޼ҵ常 ����
		
		System.out.println("=====�ٿ�ĳ���� ==========");
		Student s = (Student) p ; 	//�ٿ� ĳ���� : �θ�,�ڽ� Ŭ������ �ʵ�,�޼ҵ� ��� ����	
									// ������ �ڷ����� ��� 
		s.department = "HR";	// Student
		s.grade = "4" ;			// Student
		s.id = "1001";			// Person
		s.name = "������";		// Person
		System.out.println( s.id + "," + s.name + "," + s.grade + "," + s.department);
		
		
				
		
	}

}
