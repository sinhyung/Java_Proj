package Exception_10.p431_p442;	//sec03_try_catch_finally;  01

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		//System.out.println("Ŭ������ ���� �մϴ�. ");
	}
}

