package generic_12.restrict;

public class GenericPrinter<T extends Meterial> { //extends Meterial : ������ Ÿ���� ���� ���� 
	private T material;			
	
	public void setMaterial (T material) {	
		this.material = material;
	}
	public T getMaterial () {			
		return material;
	}
	public String toString () {
		return material.toString();
	}
	public void printing () {
		material.doPrinting();
	}
}
