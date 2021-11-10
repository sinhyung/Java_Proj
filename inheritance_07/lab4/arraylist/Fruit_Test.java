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
		return "과일의 이름 : " + fruitName + "이고, 색깔은 : " + color + 
			"이고, 크기는 : " + large + "입니다." ; }
	
}


class Apple extends Fruit {
	
	Apple(String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
	public String showInfo () { 
		return "과일의 이름 : " + fruitName + "이고, 색깔은 : " + color + 
			"이고, 크기는 : " + large + "입니다." ; }
}
class Orange extends Fruit {
	Orange(String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
	public String showInfo () { 
		return "과일의 이름 : " + fruitName + "이고, 색깔은 : " + color + 
			"이고, 크기는 : " + large + "입니다." ; }
}
	

class Banana extends Fruit {
	Banana (String fruitName, String color, int large){
		super(fruitName, color,large );
	}
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit apple = new Apple ( "사과", "빨간색" , 10);
		Fruit orange = new Orange ( "오렌지", "주황색", 20);
		Fruit banana = new Banana ( "바나나", "노란색", 30);
		
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for (Fruit f : fruitList) {
			System.out.println( f.showInfo() );
		}

	}

}
