package arrey_05.arraylist;

public class StudnetTest {

	public static void main(String[] args) {
		Student studentLee = new Student ( 1001, "Lee");
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim = new Student ( 1002, "Kim");
		
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showStudentInfo();
		System.out.println("==========================");
		studentKim.showStudentInfo();
		System.out.println("==========================");
		
		Student studentSong = new Student ( 1003, "Song");
		studentSong.addSubject("����", 90);
		studentSong.addSubject("����", 80);
		studentSong.addSubject("����", 70);
		studentSong.addSubject("����", 60);
		studentSong.addSubject("ö��", 100);

		studentSong.showStudentInfo();
	}

}
