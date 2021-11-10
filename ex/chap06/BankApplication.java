package ex.chap06;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	// ���� �����ϱ� 
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println(" ���� ���� �ϱ�");
		System.out.println("--------------");
		System.out.println(" ���� ��ȣ�� �Է� �ϼ���. ");
		String ano = scanner.next(); 
		System.out.println(" ������ ");
		String owner = scanner.next();
		System.out.println(" �ʱ� �ݾ� ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account ( ano , owner, balance);
		for (int i=0 ; i < accountArray.length; i++) {
			if (accountArray[i]== null) {
				accountArray[i] = newAccount;
				System.out.println(" ��� : ���°� ���� �Ǿ����ϴ�. " );
				break;
			}
		}				
	}
	// ���� ��� ����
	private static void accountList() {
		System.out.println("--------------");
		System.out.println(" ���� ��� ����");
		System.out.println("--------------");
		for ( int i = 0 ; i < accountArray.length ; i++ ) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno() + " " + account.getOwner() + " " + 
			        account.getBalance());
				System.out.println();			
			}
		}		
	}
	
	// ���� �ϱ� 
	private static void deposit() {
		System.out.println("--------------");
		System.out.println(" ���� �ϱ� ");
		System.out.println("--------------");
		System.out.println("������ ���¸� ��������.");
		String ano = scanner.next();
		System.out.println("���ݾ��� ��������.");
		int money = scanner.nextInt();
		Account account = findAccount(ano);	//findAccount �޼ҵ� ȣ�� 
		if (account == null) { 
			System.out.println("���� ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money );
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�. ");
		
	}
	
	// ��� �ϱ� 
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println(" ��� �ϱ� ");
		System.out.println("--------------");
		System.out.println("���� ��ȣ�� �Է� �ϼ���. ");
		String ano = scanner.next();
		System.out.println("��ݾ��� ��������. ");
		int money = scanner.nextInt();
		Account account = findAccount (ano);
		if (account == null) {
			System.out.println("���°� �����ϴ�. ");
			return;
		}
		account.setBalance(account.getBalance() - money );
		System.out.println("����� ���� �߽��ϴ�. ");
		
	}
	
	// accountArray �迭���� ano (���� ��ȣ) �� ���� �� ���¸� �˻� 
	
	private static Account findAccount(String ano) {
		Account account = null;					// ��ü ������ �ʱ�ȭ 
		for (int i=0 ; i< accountArray.length; i++) {
			if ( accountArray[i] != null) {			
				String dbAno = accountArray[i].getAno();	// ��ü�� getAno �޼ҵ带 ���ؼ�
				if (dbAno.equals(ano) ) {
					account = accountArray[i];
					break;
				}				
			}
		}		
		return account;
	}
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println( "=============================================");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println( "=============================================");
			System.out.println("����");
			int selectNo = scanner.nextInt();
			if (selectNo == 1 ) {
				createAccount();
			}else if (selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if (selectNo == 5) {
				run = false;
			}						
		}
		System.out.println("���α׷� ����");

	}

}
