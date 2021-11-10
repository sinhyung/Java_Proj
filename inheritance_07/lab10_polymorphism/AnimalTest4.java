package inheritance_07.lab10_polymorphism;
import java.util.ArrayList;		// ��ü�� �����ϴ� �迭, 
public class AnimalTest4 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();	// ����
	
	public void addAnimal () {	// ArrayList �� ��ü�� �߰��ϴ� �޼ҵ�
		
		aniList.add(new Human());	//��ü�� ArrayList �� ������ �ɶ� ��ĳ������ �ȴ�. <Animal Ÿ������>
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for ( Animal ani : aniList) {	//�迭�� ����� ��ü�� ��ȯ�ϸ鼭 ���
			ani.move();				//�������̵��� �޼ҵ� ȣ���
		}		
	}
	public void testCasting() {   // �ٿ� ĳ����
		for ( int i=0 ; i < aniList.size(); i++) {	//aniList.size() <== �迭�� ���� ����
			Animal ani = aniList.get(i);       //aniList.get(i) : ������ ���� ������ �ö� 
			if ( ani instanceof Human) {
				Human h = (Human) ani;	//�ٿ�ĳ����
				h.readBook();
			}
			else if ( ani instanceof Tiger) {
				Tiger t = (Tiger)ani ; //�ٿ� ĳ����
				t.hunting();
			}
			else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani ; 
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� Ÿ���Դϴ�. ");
			}
		}
		
	}
	

	public static void main(String[] args) {
		AnimalTest4 aTest = new AnimalTest4();
		aTest.addAnimal();
		System.out.println("=============================");
		System.out.println("<���� Ÿ������ �ٿ�ĳ���� ���� ���>");
		System.out.println("=============================");
		aTest.testCasting();

	}

}
