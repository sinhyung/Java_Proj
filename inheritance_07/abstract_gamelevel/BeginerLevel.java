package inheritance_07.abstract_gamelevel;

public class BeginerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�. ");
	}
	@Override
	public void jump() {
		System.out.println("Jump �� ���� �𸨴ϴ�. ");
	}
	@Override
	public void turn() {
		System.out.println("Turn �� ���� �𸨴ϴ�. ");
	}
	@Override
	public void showLevelMassage() {
		System.out.println("=======�ʺ��� �����Դϴ�. ========");
	}
	

}
