package inheritance_07.lab4.arraylist;

import java.util.ArrayList;

class Fruit {
	String fruitName;
	String color;
	int large; 
	
	Fruit() {}
	
	Fruit(String fruitName, String color, int large){
		this.fruitName = fruitName; 
		this.color = color;
		this.large = large;		
	}
	
	public String showInfo () { 
		return "������ �̸� : " + fruitName + "�̰�, ������ : " + color + 
			"�̰�, ũ��� : " + large + "�Դϴ�." ; }
	
}


class Apple extends Fruit {
	
	Apple(String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
	public String showInfo () { 
		return "������ �̸� : " + fruitName + "�̰�, ������ : " + color + 
			"�̰�, ũ��� : " + large + "�Դϴ�." ; }
}
class Orange extends Fruit {
	Orange(String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
	public String showInfo () { 
		return "������ �̸� : " + fruitName + "�̰�, ������ : " + color + 
			"�̰�, ũ��� : " + large + "�Դϴ�." ; }
}
	

class Banana extends Fruit {
	Banana (String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit apple = new Apple ( "���", "������" , 10);
		Fruit orange = new Orange ( "������", "��Ȳ��", 20);
		Fruit banana = new Banana ( "�ٳ���", "�����", 30);
		
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for (Fruit f : fruitList) {
			System.out.println( f.showInfo() );
		}

	}

}
