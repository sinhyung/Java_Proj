package interface_08.lab02_Scheduler;

public class PriorityAllocation implements Scheduler {
	//�� ����� ���� �� ���� ��⿭���� �����ͼ� ���� �ɷ��� ���� �������� �켱���� ����մϴ�. 
	
	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�. ");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� �������� �켱������ ��� �մϴ�. ");
		
	}
		

}
