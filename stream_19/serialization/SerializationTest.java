package stream_19.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//����ȭ (Serialization) : ��ü (�ν��Ͻ�)�� ���Ͽ� ����.
//1. Serializable : ������ ��Ʈ�ѷ� ����ȭ
//2. Externalizable : �������� ��Ʈ���� �����ϸ鼭 ����ȭ

		//ObjectOutputStream : ��ü�� ���Ϸ� ���� (����ȭ) ������Ʈ��
		//����ȭ�� Serializable �������̽��� ������ ��ü���� ����ȭ�� �� �� �ִ�
		//����ȭ�� SerialVersionUID�� ���� �Ǿ��־���Ѵ� <== ������ȣ
		//Serializable <== maker Interface (���� �ڵ尡 ���� �������̽�)

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long seralVersionUID = 5127700800134372584L;
		//����ȭ ���� ��ȣ (����ȭ���� ID)
	
	
	String name;	// �̸�
	transient String job;		// ����	transient : ����ȭ���� ����ȭ ��������
	
	public Person() {}	//�⺻������
	public Person(String name, String job) {	//������ ������ ���� �ʱ�ȭ
		this.name = name;
		this.job = job;
	}
	
	public Person(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public Person(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {		//��ü ��ü�� ���������, �̸�,����   ��ü��ü�� ���������
		return name + " , " + job;
		
	}
	
	
}
public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Person personAhn = new Person("�����","��ǥ�̻�");
		Person personKim = new Person("��ö��","���̻�");
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		
		oos.writeObject(personAhn);	//��ü�� ����
		oos.writeObject(personKim);
		System.out.println("=== ����ȭ ���� ===");
		
		
		
		
		

	}

}
