package inheritance_07.lab2;

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.set();	// ����Ŭ������ set() �޼ҵ� ���� , �θ�Ŭ������ �ʵ忡 �� �Ҵ�. 
		
		System.out.println(s.age);		//���� Ŭ������ �������
		System.out.println(s.name);		//���� Ŭ������ �̸��� ���
		System.out.println(s.height);	// ���� Ŭ������ Ű�� ���
		System.out.println(s.getWeight());  //���� Ŭ������ �����Ը� ���
	}

}
