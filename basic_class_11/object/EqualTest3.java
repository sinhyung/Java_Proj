package basic_class_11.object;

class Student3 {		
	int studentID;
	String studentName;
	int grade;  
	public Student3(int studentID, String studentName, int grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}
	//���� : //1. toString() �޼ҵ� ������ �ؼ� ��ü�� ��������� , �̸��� �г��� ��� 
			//2. equals() �޼ҵ� ������ �ؼ� studentName ������ True�� ���� �޵��� ������, 
			//3. hashcode() �޼ҵ嵵 ������ 
	@Override
	public String toString() {
		return studentName + " , " + grade;
	}
	@Override
	public int hashCode() {
		return studentID;
	}
	@Override
	public boolean equals(Object obj) {			//��ĳ����  
		if ( obj instanceof Student3) {
			Student3 std3 = (Student3) obj;		//�ٿ�ĳ����
			if ( studentName == std3.studentName) {
				return true;
			}else
				return false;
		}
		return false;
	}
	
		
}

public class EqualTest3 {

	public static void main(String[] args) {
		Student3 std3 = new Student3(100, "������", 3);
		Student3 std4 = new Student3( 200, "������", 4);
		Student3 std5 = new Student3 (300, "������", 5);
		Student3 std6 = std5;		// ��ü�� �ּ� ���� 
		System.out.println(std3);								// 16����, Hashcode : �޸��� �ּ�
		System.out.println ( System.identityHashCode(std3));	// 10����
		System.out.println ( System.identityHashCode(std4));
		System.out.println ( System.identityHashCode(std5));
		System.out.println ( System.identityHashCode(std6));
		System.out.println(std3== std4);			// ��ü�� �ּ� ��
		
		System.out.println(std3.equals(std4));	// �������̵� : studnetName������ : True 
				// Object Class�� ��ӵǴ� equals()�޼ҵ�� ��ü �ּҰ��� ��
		System.out.println(std4.equals(std5));
		System.out.println(std3.equals(std6));
	}

}
