package inheritance_07.lab9;
public class MethodOverridingEx { // ��ĳ����, �޼ҵ� �������̵�, ������ ���� 
	
	static void paint(Shape p) {	// Stact ������ ����Ǵ� �޼ҵ� , �Ű����� ( Shape p)
		p.draw();		//��ĳ���� : �������̵��� �޼ҵ带 ��ĳ�����ؼ� �ϳ��� �޼ҵ忡�� ó��
	}
	
	static void paint_l (Line l) {	//Line Ŭ����
		l.draw();
	}
	static void paint_r (Rect r) {	//Rect 
		r.draw();
	}
	static void paint_c (Circle c) { //Cicle
		c.draw();
	}
	
	
	public static void main(String[] args) {
		System.out.println("======��ĳ���� �޼ҵ� �̿��ؼ� ��� =======");
		
		Line line = new Line();		// line ��ü�� ������
		paint(line);				// paint �޼ҵ忡 line ��ü �Ҵ�
		paint (new Shape());		// paint �޼ҵ� ������ ��ü�� ���� �Ű������� ȣ��
		paint (new Line());
		paint (new Rect());
		paint (new Circle());
		
		System.out.println("============");
	
		paint_l(new Line());
		paint_r(new Rect());
		paint_c(new Circle());
		
	}
}
