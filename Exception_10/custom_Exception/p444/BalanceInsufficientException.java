package Exception_10.custom_Exception.p444;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);		//Exception �޼����� �Է�
	}						// e.getMessage() �޼��� ���
}

