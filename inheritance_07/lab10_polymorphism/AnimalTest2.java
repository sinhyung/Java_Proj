package inheritance_07.lab10_polymorphism;

public class AnimalTest2 {	// Stack ������ �޼ҵ� ����(static).
	
	public static void moveAnimal(Animal animal) {	//��ĳ����,  
		animal.move();
	}
	
	public static void main(String[] args) {
		
		AnimalTest2.moveAnimal(new Human());	//static Ű : Stack, Ŭ���� �̸����� ���
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
	}

}
