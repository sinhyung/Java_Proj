package inheritance_07.lab10_polymorphism;

public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {	//��ĳ����, //moveAnimal �޼ҵ带 ����ҷ��� ��üȭ 
		animal.move();
	}
	
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();	//��ü�� �����ؼ� moveAnimal () ���
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	

}
