package inheritance_07.abstract_template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�. ");
		System.out.println("���� ������ ������ ��ȯ�մϴ�. ");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

}
