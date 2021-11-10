package basic_class_11.object;

class Student2 {
	int studentID;
	String studentName;
	
	public Student2 ( int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {		
		return studentID + " , " + studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if (studentID == std.studentID) {
				return true;
			}else {
				return false;
			}				
		}
		return false;
	}
	@Override
	public int hashCode() {		//equals() �޼ҵ带 �������̵� �ؼ� ��ü�� ���� ���Ҷ� 
		return studentID;		// ���ϴ� ������ hashCode() �޼ҵ带 �������̵� �ؾ��Ѵ�. 
	}	
	
}

public class EqualTest2 {
	public static void main(String[] args) {
		Student2 Lee = new Student2 ( 1000, "�̼���");
		Student2 Lee2 = new Student2 ( 1000, "�̼�");
		System.out.println(Lee);
		System.out.println(Lee == Lee2);      // false (�ּ�)
		System.out.println(Lee.equals(Lee2)); // false (�ּ�)  ===> True (equals()�޼ҵ带 ������)
			// Object Class�� equals ()�޼���� �ּҸ� ���մϴ�.
			// ��ü�� studentID�� ���� ��� ���ٶ�� ������ equals() �޼ҵ带 �������̵� �մϴ�. 

		System.out.println("Lee �� hashcode : " + Lee.hashCode());
		System.out.println("Lee2�� hashcode : " + Lee2.hashCode());
		
		System.out.println("Lee�� ���� �ּҰ� : " + System.identityHashCode(Lee));
		System.out.println("Lee2�� ���� �ּҰ� : " + System.identityHashCode(Lee2));
		
	}

}
