package Exception_10.custom_Exception.p444;

public class Account {
	private long balance;		// ¿‹∞Ì (µ∑)

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {	// ¿‘±›
		balance += money;
	}
	
	//√‚±› 
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("¿‹∞Ì∫Œ¡∑:"+(money-balance)+" ∏¿⁄∂˜");
		}
		balance -= money;
	}
}

