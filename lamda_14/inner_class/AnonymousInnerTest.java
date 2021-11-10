package lamda_14.inner_class;

class Outer2 {
	/*
	 * �͸� (����) Ŭ���� : Ŭ���� �̸��� ���� Ŭ����, 
	 * - �߻� Ŭ������ �߻�޼ҵ�, �������̽��� �߻�޼ҵ带 ��� ����ϰ� ������ ���.
	 */
	
	//1. �޼ҵ带 ����ؼ� ����
	Runnable getRunnable(int i) { //�͸� ���� Ŭ���� , �޼ҵ� ������ Ŭ���� �̸��� ������ ���� Ŭ����	
		int num = 100;
		return new Runnable() { // <<== �͸� ���� Ŭ����
			
			@Override
			public void run () {
				
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	
	//2. �޼ҵ� ��� ���� ���� ����.
	Runnable runner =  new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
			
		}
	};
}
	

public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
		

	}

}
