package interface_08.lab02_Scheduler;

import java.util.Scanner;

public class SchedulerEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean run = true;
		
		while ( run ) 
		{
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���. ");
		System.out.println("R : �� �� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱 ������ ���� ���� �� ���� �Ҵ�");
		System.out.println("���� ���ڸ� �������� >> ");
		
		String ch = sc.next();	
		if (ch.equals("�׸�")) { break; }
		Scheduler scheduler = null; 	// Scheduler ��ü ���� 
		
		if ( ch.equals("R") || ch.equals("r")) {		//ch ������ ���� R, r �̸� 
			scheduler = new RoundRobin();	// scheduler �ν��Ͻ� ������ RoundRobin() ��ü�� �Ҵ�
		}
		else if ( ch.equals("L") || ch.equals("l")) {
			scheduler = new LeastJob();			//��ĳ����
		}
		else if ( ch.equals("P") || ch.equals("p")) {
			scheduler = new PriorityAllocation();	//��ĳ���� 
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�. ");
			return ;
		}
		
		scheduler.getNextCall();			//�޼ҵ� ȣ��
		scheduler.sendCallToAgent();
		System.out.println();
		System.out.println("======================");
	
		}
		System.out.println("���α׷��� ���� �մϴ�. ");
		sc.close();
	}

}
