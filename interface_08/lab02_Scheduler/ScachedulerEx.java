package interface_08.lab02_Scheduler;

import java.io.IOException;

public class ScachedulerEx {

	public static void main(String[] args) throws IOException   {
		
			
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���. ");
		System.out.println("R : �� �� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱 ������ ���� ���� �� ���� �Ҵ�");
		System.out.println("���� ���ڸ� �������� >> ");
		
		int ch = System.in.read();	//���� ó���� �ʿ���. 
		Scheduler scheduler = null; 	// Scheduler ��ü ���� 
		
		if ( ch == 'R' || ch == 'r') {		//ch ������ ���� R, r �̸� 
			scheduler = new RoundRobin();	// scheduler �ν��Ͻ� ������ RoundRobin() ��ü�� �Ҵ�
		}
		else if ( ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();			//��ĳ����
		}
		else if ( ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();	//��ĳ���� 
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�. ");
			return ;
		}
		
		scheduler.getNextCall();			//�޼ҵ� ȣ��
		scheduler.sendCallToAgent();
	
	}

}
