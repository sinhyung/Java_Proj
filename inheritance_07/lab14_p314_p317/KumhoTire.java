package inheritance_07.lab14_p314_p317;
public class KumhoTire extends Tire {
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {	//��ũ�� �� ���� �� (True ����)
			System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {			// ��ũ�� ���� �� (False ����)
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
}
