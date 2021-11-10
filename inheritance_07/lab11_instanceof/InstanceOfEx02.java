package inheritance_07.lab11_instanceof;

class Animal {}
class Human extends Animal {}
class Tiger extends Animal {}
class Lion extends Animal {}
class Egle extends Animal {}
class HumanChild extends Human{}
class HumanChilson extends HumanChild{}

public class InstanceOfEx02 {
	static void print(Animal a) {
		if ( a instanceof Animal) { System.out.println("Animal");}
		if ( a instanceof Human) {System.out.println("Human");}
		if ( a instanceof Tiger) {System.out.println("Tiger");}
		if ( a instanceof Egle) {System.out.println("Egle");}
		if ( a instanceof HumanChild) {System.out.println("HumanChild");}
		if ( a instanceof HumanChilson) {System.out.println("HumanChildson");}
	}
	public static void main(String[] args) {
		System.out.println("new Animal() --> \t");print (new Animal());
		System.out.println("new Human() --> \t");print (new Human());
		System.out.println("new Tiger() --> \t");print (new Tiger());
		System.out.println("new Lion() --> \t");print (new Lion());
		System.out.println("new Egle() --> \t");print (new Egle());
		System.out.println("new HumanChild() --> \t");print (new HumanChild());
		System.out.println("new HumanChilson() --> \t");print (new HumanChilson());
	}

}
