package inheritance_07.r;
import inheritance_07.q.A;	// �ٸ� ��Ű���� Ŭ������ ����Ҷ� import �� �ʿ�. 
public class B extends A {
	void set () {
		pub = 1;	// ��� ������ ���� ���
		pro = 2;	// ��� ���迡 ������ �ٸ� ��Ű������ ���� ����. 
//		def = 3;	// �ٸ� ��Ű������ ���� �Ұ�
//		pri = 4; 	// ���� Ŭ���������� ���ٰ��� 
	}
	void showInfo() {
		System.out.println( "pub : " + pub);
		System.out.println( "pro : " + pro);
//		System.out.println( "def : " + def);	// �ٸ� ��Ű������ ���� �Ұ�
//		System.out.println( "pri : " + pri);	// ���� Ŭ���������� ���ٰ���
	}


}
