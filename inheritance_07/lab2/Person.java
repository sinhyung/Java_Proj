package inheritance_07.lab2;

public class Person {
	
	private int weight;			// ������ : private 
	int age;					// ����   : default
	protected int height;		// Ű    : protected
	public String name;			// �̸�   : public
	
	public void setWeight( int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

}
