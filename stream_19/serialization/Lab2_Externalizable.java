package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable {
	String name;			// Externalizable ó�� (C:\Temp\animal.dat)
	int age;				// ��ü 2�� (���� : 10, ȣ����: 20) ����ȭ �ؼ� ����, �о����, �κ��� ���
	
	public Animal () {}
	public Animal(String name, int age) {
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " ," + age;
		
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
}


public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException {
		Animal Lion = new Animal ("����", 10);
		Animal tiger = new Animal ("ȣ����", 20);
		
		FileOutputStream fis = new FileOutputStream ("C:\\Temp\\Animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fis);
		
		oos.writeObject(Lion);
		oos.writeObject(tiger);
		
		System.out.println("����ȭ ����");

	}

}
