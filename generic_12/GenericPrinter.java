package generic_12;

public class GenericPrinter<T> {		//�پ��� ��Ḧ ����ϴ� ������ (�������� ������)
									//�پ��� ��ü ������Ÿ���� �޾Ƽ� ó��, 
									//������ ��� ( �Ŀ��, �ö�ƽ........)
	private T material;			//�ν��Ͻ�(��ü)����
	
	public void setMaterial (T material) {	// setter <== material ������ �� �Ҵ�.
		this.material = material;
	}
	public T getMaterial () {			//getter <== material ������ ���� ������
		return material;
	}
	public String toString () {
		return material.toString();
	}
	public void printing () {
		//material.doPrinting();
	}
	
}
