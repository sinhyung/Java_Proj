package inheritance_07.lab9;
public class MethodOverridingEx { // 업캐스팅, 메소드 오버라이딩, 다형성 구현 
	
	static void paint(Shape p) {	// Stact 영역에 저장되는 메소드 , 매개변수 ( Shape p)
		p.draw();		//업캐스팅 : 오버라이딩됨 메소드를 업캐스팅해서 하나의 메소드에서 처리
	}
	
	static void paint_l (Line l) {	//Line 클래스
		l.draw();
	}
	static void paint_r (Rect r) {	//Rect 
		r.draw();
	}
	static void paint_c (Circle c) { //Cicle
		c.draw();
	}
	
	
	public static void main(String[] args) {
		System.out.println("======업캐스팅 메소드 이용해서 출력 =======");
		
		Line line = new Line();		// line 객체를 생성후
		paint(line);				// paint 메소드에 line 객체 할당
		paint (new Shape());		// paint 메소드 내에서 객체를 생성 매개변수로 호출
		paint (new Line());
		paint (new Rect());
		paint (new Circle());
		
		System.out.println("============");
	
		paint_l(new Line());
		paint_r(new Rect());
		paint_c(new Circle());
		
	}
}
