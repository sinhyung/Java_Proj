package stream_19.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab1_ReadSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream ("C:\\Temp\\student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Student s1 = (Student) ois.readObject();
		Student s2 = (Student) ois.readObject();
		Student s3 = (Student) ois.readObject();
		
		System.out.println("===��ü ���� ��� toString() : ��ü ��ü===");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("==��ü�� �������� ���==");
		System.out.println(s1.name + " ," + s1.id + " , " + s1.phoneNumber + "," + s1.email);
		

	}

}
