package inheritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point ();			// Point ��ü ����  : p
		p.set(1, 2);
		p.showpoint();
		
		
		System.out.println(p);     // ��ü �ڽ��� ��� ������ ��ü�� �ּҸ� �����
	
		
		ColorPoint cp = new ColorPoint ();	// ColorPoint ��ü ����. : cp
								// cp�� Point ��ü�� �ʵ峪 �޼ҵ带 ���� �� �� �ִ�. 
		
		cp.set(3, 4);			// cp ��ü�� set()�޼ҵ尡 ����. ��ӵ� �޼ҵ� 
		cp.setColor("red");
		cp.showColorPoint();
		
		System.out.println(cp);   // ��ü �ڽ��� ��� ������ ��ü�� �ּҸ� �����
		
		
		
		
	}

}
