package inheritance_07.lab10_polymorphism;

public class Human extends Animal {
	
	@Override
	public void move () {	// �������̵�
		System.out.println("����� �ι߷� �Ƚ��ϴ�. ");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�. ");
	}

}
