package interface_08.lab01;

public class SamsungPhone implements PhoneInterface {// implements : �������̽��� �����ϴ� Ŭ����

	@Override
	public void sendCall() {			//�߻� �޼ҵ� ���� (�������̵�)
		System.out.println("�츮������");	//�����ϴ� Ŭ�������� public ���������� �����ϸ� ���� �߻�
	}
	@Override
	public void receiveCall() {			//�߻� �޼ҵ� ���� (�������̵�)
		System.out.println("��ȭ�� �Խ��ϴ�. ");
	}	
	public void flash() {				// �޼ҵ带 �߰� �ۼ�
		System.out.println("��ȭ�⿡ ���� �������ϴ�. ");
	}

}
