package basic_class_11.class_ex;

public class ClassTest {	// Ŭ���� ������ ��ü�� ��ü �̸� �˾ƿ���  (��Ű���̸�.Ŭ�����̸�)

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Person person = new Person();
		Class pClass1 = person.getClass(); // ObjectŬ������ getClass() �޼ҵ� ���
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;   // ���� class���� ����
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("basic_class_11.class_ex.Person"); //Ŭ���� �̸����� ��������
		System.out.println(pClass3.getName());
		
		System.out.println(person.getClass());
		
		

	}
}
