package inheritance_07.lab10_polymorphism;

public class Tiger extends Animal {
	
	@Override
	public void move() {	// �������̵� �� �޼ҵ�
		System.out.println("ȣ���̴� �׹߷� �ݴϴ�. ");
	}
	
	public void hunting () {
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}

}
