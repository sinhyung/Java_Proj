package inheritance_07.abstract_template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("====���� ���� �ڵ��� =========");
		Car myCar = new AICar();	//��ĳ����
		myCar.run();
		
		System.out.println("=======����� �����ϴ� �ڵ��� =======");
		Car yourCar = new ManualCar(); // ��ĳ����
		yourCar.run();
	}

}
