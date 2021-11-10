package ex.chap06.add;
import java.util.ArrayList;
import java.util.Scanner;
public class BankApplication {
	//private static Account[] accountArray = new Account[100]; // �迭 
	private static ArrayList<Account> arr = new ArrayList<Account>();
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
	
				arr.add(newAccount) ;
				System.out.println(" ��� : ���°� ���� �Ǿ����ϴ�. " );
				
			
	
		//System.out.println("�迭 ���� ���� : " + arr.size());
	}
	// ���� ��� ����
	private static void accountList() {
		System.out.println("--------------");
		System.out.println(" ���� ��� ����");
		System.out.println("--------------");
		for ( int i = 0 ; i < arr.size() ; i++ ) {
			Account account = arr.get(i);
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
		for (int i=0 ; i< arr.size(); i++) {
			if ( arr.get(i) != null) {			
				String dbAno = arr.get(i).getAno();	// ��ü�� getAno �޼ҵ带 ���ؼ�
				if (dbAno.equals(ano) ) {
					account = arr.get(i);
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
