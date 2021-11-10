package object06.lab2;
//교재 :235 Page

public class Car {   //this : 객체 자신을 지칭
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed (int speed) {
		this.speed = speed;
	}
	void run () {
		for (int i=10; i<=50; i+=10) {	// i= i + 10
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed
					+ "km/h)");
			
		}
	}
}
