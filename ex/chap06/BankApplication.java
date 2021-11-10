package ex.chap06;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	// 계좌 생성하기 
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println(" 계좌 생성 하기");
		System.out.println("--------------");
		System.out.println(" 계좌 번호를 입력 하세요. ");
		String ano = scanner.next(); 
		System.out.println(" 계좌주 ");
		String owner = scanner.next();
		System.out.println(" 초기 금액 ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account ( ano , owner, balance);
		for (int i=0 ; i < accountArray.length; i++) {
			if (accountArray[i]== null) {
				accountArray[i] = newAccount;
				System.out.println(" 결과 : 계좌가 생성 되었습니다. " );
				break;
			}
		}				
	}
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println(" 계좌 목록 보기");
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
	
	// 예금 하기 
	private static void deposit() {
		System.out.println("--------------");
		System.out.println(" 예금 하기 ");
		System.out.println("--------------");
		System.out.println("예금할 계좌를 넣으세요.");
		String ano = scanner.next();
		System.out.println("예금액을 넣으세요.");
		int money = scanner.nextInt();
		Account account = findAccount(ano);	//findAccount 메소드 호출 
		if (account == null) { 
			System.out.println("결재 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money );
		System.out.println("결과 : 예금이 성공적으로 입금 되었습니다. ");
		
	}
	
	// 출금 하기 
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println(" 출금 하기 ");
		System.out.println("--------------");
		System.out.println("계좌 번호를 입력 하세요. ");
		String ano = scanner.next();
		System.out.println("출금액을 넣으세요. ");
		int money = scanner.nextInt();
		Account account = findAccount (ano);
		if (account == null) {
			System.out.println("계좌가 없습니다. ");
			return;
		}
		account.setBalance(account.getBalance() - money );
		System.out.println("출금이 성공 했습니다. ");
		
	}
	
	// accountArray 배열에서 ano (계좌 번호) 와 동일 한 계좌를 검색 
	
	private static Account findAccount(String ano) {
		Account account = null;					// 객체 변수를 초기화 
		for (int i=0 ; i< accountArray.length; i++) {
			if ( accountArray[i] != null) {			
				String dbAno = accountArray[i].getAno();	// 객체의 getAno 메소드를 통해서
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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println( "=============================================");
			System.out.println("선택");
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
		System.out.println("프로그램 종료");

	}

}
