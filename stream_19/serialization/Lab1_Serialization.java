package stream_19.serialization;

import java.io.*;	//java.io.* : java.io.하위의 모든 클래스 import됨

class Student implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4417558298039535135L;
	String name;		//직렬화해서 (C:\Temp\student.dat)
	int id;				//역직열화 : 직열화된 파일에서 변수의 값을 읽어옴
	String phoneNumber;	//객체 3개 생성
	String email;
	public Student (String name, int id, String phoneNumber, String email) {
		this.name = name; this.id = id; phoneNumber = phoneNumber; this.email=email;
		
	}
	
	@Override
	public String toString() {
		return "이름: " + name + " 아이디 : " + id + " 폰번호 : " + phoneNumber + " 메일 "+
				email;
	
	}
	

	

	
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException {
		Student studentA = new Student ("홍길동" , 1, "010-1111-1111", "aaa@aaa.com");
		Student studentB = new Student ("이순신" , 2, "010-0000-0000", "bbb@bbb.com");
		Student studentC = new Student ("김유신" , 3, "010-1111-3333", "ccc@ccc.com");
		
		FileOutputStream fis = new FileOutputStream("C:\\Temp\\student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(studentA);
		oos.writeObject(studentB);
		oos.writeObject(studentC);
	}

}
