package basic_class_11.object;

class Student {
	int studentID;
	String studentName;
	
	public Student( int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {		
		return studentID + " , " + studentName;
	}	
}

public class EqualTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̼���");
		Student studentLee2 = studentLee; 	//��ü�� �ּҸ� ���� 
		Student studentLee3 = new Student(100,"�̼���");
		
		if (studentLee == studentLee2) {	// "=="
			System.out.println("�� �ּҴ� �����ϴ�. ");
		}else {
			System.out.println("�� �ּҴ� �ٸ��ϴ�. ");
		}
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee �� studentLee2�� �����մϴ�. ");
		}else {
			System.out.println("studentLee �� studentLee2�� �������� �ʽ��ϴ�.");
		}
		System.out.println("======================================");
		if (studentLee == studentLee3) {
			System.out.println("�� �ּҰ� �����ϴ�.");
		}else {
			System.out.println("�� �ּҰ� �ٸ��ϴ�. ");
		}
		if (studentLee.equals(studentLee3)) {
			System.out.println("studentLee�� studentLee3�� �����մϴ�. ");
		}else {
			System.out.println("studentLee�� studentLee3�� �ٸ��ϴ�. ");
		}
		
		Object o = studentLee;		//��ĳ����
		
		//Object Class �� equals ()�޼ҵ�� �ΰ�ü�� �ּҸ� �� ��
		//��ü�� ���� ���ϱ� ���ؼ��� Object Class�� equals () �޼ҵ带 ������ �ؾ��Ѵ�. 
		
		System.out.println(studentLee);
		
		
		
		
		
		
		
	}

}
