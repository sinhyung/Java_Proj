package basic_class_11.class_ex;

public class Person {
	private String name;	//������, settor �� ���ؼ� �Ҵ�: private
	private int age;
	
	public Person () {}					//�⺻ ������
	public Person (String name) {		//������ : �Ű����� 1��
		this.name = name;
	}
	public Person (String name, int age) {	//������ : �Ű����� 2��
		this.name = name;
		this.age =age;				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
