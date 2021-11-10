package inheritance_07.lab10_polymorphism;

public class AnimalTest3 {

	public static void moveAnimal(Animal animal) {	//��ĳ����,  
		animal.move();
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		AnimalTest3.moveAnimal(human);	//static Ű : Stack, Ŭ���� �̸����� ���
		AnimalTest3.moveAnimal(tiger);
		AnimalTest3.moveAnimal(eagle);
	}
}
