package basic_class_11.class_ex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);	//new�� ����ؼ� ��ü ���� 
		
		Class pClass = Class.forName("basic_class_11.class_ex.Person");
		Person person2 = (Person) pClass.newInstance();		
					//newInstance() : *.class ���Ϸ� ��ü ���� 
		System.out.println(person2);
	}

}
