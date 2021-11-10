package inheritance_07.lab13;

import java.util.ArrayList;

class Fruit {		// �θ� Ŭ����
	String fruitName;	//������ �ʱⰪ�� �Ҵ� : 1. ������, 2. Setter, 3. ��ü���� �������� �Ҵ�
	String color;
	int large;
	
	Fruit(){}
	public Fruit (String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;		
	}
	
	public String showInfo() {
		return  "������ ������ ����մϴ�." ;
	}
	
}
class Apple extends Fruit {
	public Apple (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "���� �̸��� " + fruitName + "�̰� , ������ " + color + " �̰�, ũ��� " + 
				large + " �Դϴ�" ;
	}
	public void app () {
		System.out.println("�ٿ� ĳ�������� ����� ��� �մϴ�.  ");
	}
	
}
class Orange extends Fruit{
	public Orange (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "���� �̸��� " + fruitName + "�̰� , ������ " + color + " �̰�, ũ��� " + 
				large + " �Դϴ�" ;
	}
	public void org () {
		System.out.println("�ٿ� ĳ�������� �������� ��� �մϴ�. ");
	}
}
class Banana extends Fruit {
	public Banana (String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "���� �̸��� " + fruitName + "�̰� , ������ " + color + " �̰�, ũ��� " + 
				large + " �Դϴ�" ;
	}
	public void bana ( ) {
		System.out.println("�ٿ� ĳ�������� �ٳ����� ��� �մϴ�. ");
	}
}


public class Fruit_Test {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit> ();
		
		Fruit apple =new Apple("���", "����" , 10);			// ��ĳ����
		Fruit orange = new Orange ("������" , "��Ȳ", 20);		// ��ĳ����
		Fruit banana = new Banana ( "�ٳ���", "���", 30);		// ��ĳ����
		
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for (Fruit f : fruitList) {
			System.out.println( f.showInfo() );
		}
		System.out.println("========�ٿ�ĳ�������� ����ϼ���.==4�ñ���===========");
		Apple a = (Apple) apple ; 	//�ٿ� ĳ����  
		a.app();
		Orange o = (Orange) orange; //�ٿ� ĳ����
		o.org();
		Banana b = (Banana) banana; // �ٿ� ĳ����
		b.bana();
		
		System.out.println("=========ArrayList ����� ��ü�� �ٿ�ĳ����====================");
		for ( int i = 0 ; i < fruitList.size() ; i ++ ) {
			Fruit f = fruitList.get(i);
			if ( f instanceof Apple ) {
				Apple ap = (Apple) f ;
				ap.app();				
			}
			if ( f instanceof Orange) {
				Orange or = (Orange) f ;
				or.org();
			}
			if (f instanceof Banana) {
				Banana ba = (Banana) f;
				ba.bana();
			}
		}
	
	}

}
