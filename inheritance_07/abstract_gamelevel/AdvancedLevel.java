package inheritance_07.abstract_gamelevel;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("���� Jump �մϴ�. ");
	}
	@Override
	public void turn() {
		System.out.println("Turn�� ���� �𸨴ϴ�. ");
	}
	@Override
	public void showLevelMassage() {
		System.out.println("========�߱��� �����Դϴ� ===========");
	}

}
