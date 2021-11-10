package stream_19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerializationTest {	// ���Ͽ� ����� ��ü�� �о ���

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p1 = (Person) ois.readObject();	//ù��° ��ü�� �о p1�� �Ҵ�
		Person p2 = (Person) ois.readObject();	//�ι�° ��ü�� �о p2�� �Ҵ�
		
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
