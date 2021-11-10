package inheritance_07.lab8_p299_300;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;		// Stack ������ ����Ǵ� ��� 
	public static final int SUPERSONIC = 2; // Stack ������ ����Ǵ� ��� 
	
	public int flyMode = NORMAL;	
	
			// ������̼�, @Override : �޼ҵ� ������ �Ҷ� ������ �����ϰ� ���ؼ� ���. 
	@Override				// �޼ҵ� ������[�������̵�] : �θ�Ŭ������ ������ Ÿ��,�Ű����� ����, ���� 
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");			
		} else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();	//���� Ŭ������ fly()
		}
	}
}

