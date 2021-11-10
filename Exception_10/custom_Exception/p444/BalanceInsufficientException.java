package Exception_10.custom_Exception.p444;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);		//Exception 메세지를 입력
	}						// e.getMessage() 메세지 출력
}

