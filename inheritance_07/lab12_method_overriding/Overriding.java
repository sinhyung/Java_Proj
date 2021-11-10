package inheritance_07.lab12_method_overriding;

class Weapon{
	protected int fire() {
		return 1; 		// ������ ���� , �⺻������ ����� 1�� ���
	}
}
class Cannon extends Weapon{	// ���� , ���� ��� ���� 10 ��� 
	@Override
	protected int fire() {
		return 10;		// ��� ���� 10
	}
	protected void info () {
		System.out.println("������ ���ɷ��� Ů�ϴ�. ");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon  weapon ;
		weapon = new Weapon();
		System.out.println("�⺻ ��� �ɷ��� " + weapon.fire()); //
		weapon = new Cannon();	// ��ĳ����
		System.out.println("������ ��� �ɷ��� " + weapon.fire()); // �������̵� �޼ҵ� 
		
		Cannon c = (Cannon) weapon;	// �ٿ� ĳ���� 
		c.info();	//Cannon �� �޼ҵ� ȣ�� 
	}
}
