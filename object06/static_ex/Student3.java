package object06.static_ex;

public class Student3 {
	private static int serialNum = 1000; //외부 클래스에서 직접 접근을 차단. 
										// getter, Setter를 통해서만 접근이 가능
									// 무결성을 체크 해서 적용할 수 있다. 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3( ) {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
	return studentName;
	}
	public void setStudnetName(String studentName) {
	this.studentName = studentName;
	}
	public static int getSerialNum() {
	int i = 10;
	return serialNum;
	}
	public static void setSerialNum(int serialNum) { // 무결성을 제공 할 수 있다. 
	Student.serialNum = serialNum;
}

}

//P 238. 239. Calculator.java	, CalculatorExample.java

//6장  클래스 << 277 - 확인 문제  1번 ~ 20 번까지. >> 
















