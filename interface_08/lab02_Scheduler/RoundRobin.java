package interface_08.lab02_Scheduler;

public class RoundRobin implements Scheduler {
	// ���� �Ѹ� ���ư��� �����ϰ� ��� ������ ����մϴ�. 

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�. ");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ��� �մϴ�. ");
	}
		
}
