package Exception_10.custom_Exception.p444;

public class Account {
	private long balance;		// �ܰ� (��)

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {	// �Ա�
		balance += money;
	}
	
	//��� 
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:"+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}

