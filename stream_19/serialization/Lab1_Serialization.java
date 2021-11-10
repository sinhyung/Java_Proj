package stream_19.serialization;

import java.io.*;	//java.io.* : java.io.������ ��� Ŭ���� import��

class Student implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4417558298039535135L;
	String name;		//����ȭ�ؼ� (C:\Temp\student.dat)
	int id;				//������ȭ : ����ȭ�� ���Ͽ��� ������ ���� �о��
	String phoneNumber;	//��ü 3�� ����
	String email;
	public Student (String name, int id, String phoneNumber, String email) {
		this.name = name; this.id = id; phoneNumber = phoneNumber; this.email=email;
		
	}
	
	@Override
	public String toString() {
		return "�̸�: " + name + " ���̵� : " + id + " ����ȣ : " + phoneNumber + " ���� "+
				email;
	
	}
	

	

	
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException {
		Student studentA = new Student ("ȫ�浿" , 1, "010-1111-1111", "aaa@aaa.com");
		Student studentB = new Student ("�̼���" , 2, "010-0000-0000", "bbb@bbb.com");
		Student studentC = new Student ("������" , 3, "010-1111-3333", "ccc@ccc.com");
		
		FileOutputStream fis = new FileOutputStream("C:\\Temp\\student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(studentA);
		oos.writeObject(studentB);
		oos.writeObject(studentC);
	}

}
