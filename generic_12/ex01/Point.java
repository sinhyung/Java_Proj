package generic_12.ex01;

public class Point<T, V> {		// ���ʸ� Ŭ����, ������ ��ǥ�� �Է� �޾Ƽ�, ��ǥ�� ���̸� ����
	T x;	
	V y;
	
	Point (T x, V y){		//������
		this.x = x;
		this.y = y;
	}
	
	public T getX() {		// x���� ���� ����
		return x;
	}
	public V getY() {		// y���� ���� ���� 
		return y;
	}
	
	
}
