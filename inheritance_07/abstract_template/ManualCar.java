package inheritance_07.abstract_template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� ���� �մϴ�. ");
		System.out.println("����� �ڵ��� �����մϴ�. ");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ���� �մϴ�. ");
	}

}
