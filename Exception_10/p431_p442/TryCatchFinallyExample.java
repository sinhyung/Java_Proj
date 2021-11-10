package Exception_10.p431_p442;	//sec03_try_catch_finally;  01

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		//System.out.println("클래스가 존재 합니다. ");
	}
}

