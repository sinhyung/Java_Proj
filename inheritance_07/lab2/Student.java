package inheritance_07.lab2;

public class Student extends Person {
	
	public void set () {
		age = 30;			//default ���� ������
		name = "ȫ�浿";		//public ���� ������
		height = 175;		//protected ���� ������. 
//		weight = 99;		// private ���� ������ �̹Ƿ� ����, setter�� ���
		setWeight (99); 	// setter�� ���ؼ� �� �Ҵ�
	}

}
