package interface_08.lab02_Scheduler;

public class LeastJob implements Scheduler {
	// ���� �������� ���ų� ��� ��Ⱑ ���� ���� �������� ���� �����ϴ�.
	
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� ���� �ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ��� ��Ⱑ ���� ���� �������� ��ȭ ���� �Ҵ��մϴ�.");
	}
	
	
	
}
