package Exception_10.custom_Exception;

public class IDFormatTest {
	private String userID;	//userID : NULL�� ���� ��� :  ����� ���� Exception �߻�
							//userID : 8�̻� 20�� ���ϰ� �ƴ� ��� : ����� ���� Exception �߻� 
	public String getUserID() {
		return userID;
	}	
		// throw : ������ Exception�� �߻� ��ų�� ���
	    // throws : Exception�� �̷궧 ���
	
	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null ) {	//userID�� null �� ��� : ������ Exception�� �߻� ��Ŵ
			throw new IDFormatException ("���̵�� null�� �� �����ϴ�. ");			
		}
		else if (userID.length() < 8 || userID.length() > 20 ) {
			throw new IDFormatException ("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		/*
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());		
		}
		*/
		
		
			//userID�� Null�� ���� ��� 
			try {
				test.setUserID(userID);
			} catch (IDFormatException e1) {
				System.out.println(e1.getMessage());
			}
		
		
		
		//userID�� 7�ڸ� ���� ��� 
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
				
	}

}
