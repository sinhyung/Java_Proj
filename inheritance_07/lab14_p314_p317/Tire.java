package inheritance_07.lab14_p314_p317;
public class Tire {
	//�ʵ�
	public int maxRotation;     		//�ִ� ȸ����(�ִ� ����)
	public int accumulatedRotation;		//���� ȸ����
	public String location;       			//Ÿ�̾��� ��ġ

	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//�޼ҵ�
	public boolean roll() {		// ���� 1�� ����
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {	// ��ũ�� �ȳ��� �� (true)
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {	//��ũ�� ������ (false)
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}

