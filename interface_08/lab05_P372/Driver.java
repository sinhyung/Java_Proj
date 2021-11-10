package interface_08.lab05_P372;

public class Driver {	//매개변수의 인터페이스화
	
	public void drive (Vehicle vehicle) {  //업캐스팅. 
		vehicle.run();

	}
}

// 교재 8장 인터페이스 예문 [ 4: 20 분 까지 ]
//p 349 : RemoteControl.java  <인터페이스>
//P 351 : Television.java	  <구현 클래스>
//P 352 : Audio.java		  <구현 클래스>
//p 354 : RemoteControlExample.java		<실행>