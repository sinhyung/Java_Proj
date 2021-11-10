package arrey_05.arraylist;
import java.util.ArrayList;   //�ٸ� ��Ű���� Ŭ������ ����Ҷ� import�� �ʿ���
public class Student {
	int studentID;		// �й�
	String studentName; // �̸�
	ArrayList<Subject> subjectList;  //ArrayList�� ����ؼ� subjectList �迭���� ����
	//ArrayList<Subject> subjectList = new ArrayList<Subject>();	
		// ����� ���ÿ� ArrayList ��ü �迭 ���� 

	public Student (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //subjectList �迭 ���� ����
	}
	public void addSubject (String name, int score) { // 
		Subject subject = new Subject ();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);		// ��ü�� ArrayList �迭 ���� subjectList�� �߰� 
	}
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();
		System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + 
					s.getScorePoint() + "�Դϴ�."	);
		
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�Դϴ�.");
		
	}
	
}
