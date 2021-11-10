package inheritance_07.abstract_gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();			//�޸���. ������ ���� �ٸ��� �޸���. 
	public abstract void jump();		//���� ������ ���� �ٸ��� ����
	public abstract void turn();		//���� ��ȯ �� ������ ���� �ٸ��� ��ȯ
	public abstract void showLevelMassage(); //������ ������ ���
	
	final public void go ( int count) {		// ���ø� �޼ҵ� : ������ ����, �������̵� �Ұ�
		run();
		for (int i=0 ; i<count; i++) {
			jump();
		}
		turn();		
	}
}
