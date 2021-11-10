package inheritance_07.lab14_p314_p317;
public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {	//��ũ�� �ȳ����� 
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {			// ��ũ�� ������ 
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
