package inheritance_07.lab8_p299_300;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();		
		sa.takeOff();
		sa.fly();			// �������̵��� fly()�� ȣ��	
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// Ŭ�����̸����� ȣ�� (static)
		sa.fly();			// �������̵��� fly()�� ȣ��	
		sa.flyMode = SupersonicAirplane.NORMAL;			// Ŭ�����̸����� ȣ�� (static)
		sa.fly();		    // �������̵��� fly()�� ȣ��	
		sa.land();
	}
}

