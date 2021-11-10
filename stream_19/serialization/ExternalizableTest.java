package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Exteralizabale : �������� ��Ʈ���� �ϸ鼭 ����ȭ ���(�޼ҵ� ������)

class Dog implements Externalizable{
	String name;
	int age;
	public Dog () {}
	public Dog (String name, int age){
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " , " + age ;
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);		//��½� ȣ�� �Ǵ� �޼ҵ� (�ƿ�ǲ ��Ʈ��)
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();		//��ǲ�� ȣ��Ǵ� �޼ҵ�(��ǲ ��Ʈ��)
		age = in.readInt();
	}
	
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog myDog = new Dog ("�����", 3);
		Dog yourDog = new Dog ("������", 2);
		
		FileOutputStream fis = new FileOutputStream ("C:\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fis);
		
		oos.writeObject(myDog);
		oos.writeObject(yourDog);
		
		System.out.println("===����ȭ ���� (Externalizable)");

	}

}
