package inheritance_07.lab10_polymorphism;

public class Eagle extends Animal {
	
	@Override
	public void move(){
		System.out.println("�������� �ϴ��� �����ϴ�.");
	}
	public void flying() {
		System.out.println("�������� �ϴ��� ���� ���� �����ϴ�. ");
	}
}
