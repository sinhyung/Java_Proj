package inheritance_07.lab4.arraylist;

public class Customer {		// �� ������ ��Ÿ���� �θ� Ŭ���� 
	protected int customerID;			// �� ID
	protected String customerName;		// �� �̸�
	protected String customerGrade;		// ���� ��� ( VIP, Gold, Silver...)/ ��������Ʈ, ���η�
	int bonusPoint;				// ���ʽ� ����Ʈ, ����Ʈ ���� : �� ��޿� ���� ���� ����
	double bonusRatio;			// ����Ʈ ���� ��� : ����޿� ���� ��ǰ���� ���� 
	
	public Customer() {			// �⺻ ������ : �⺻ ȸ�� ����� �ʱ�ȭ 
		initCustomer();			 		
	}
	public Customer ( int customerID, String customerName) {
		this.customerID = customerID; this.customerName = customerName;
		initCustomer();
	}
	private void initCustomer() {	// ������� �ʱ�ȭ �ϴ� �޼ҵ� 
		customerGrade = "Silver";   // �⺻ ȸ���� ��� : Silver
		bonusRatio = 0.01;			// ����Ʈ ���� ����, ��ǰ ������ 1% ���� , 
	}
	
	public int calcPrice ( int price ) {	// ������ ��ǰ�� ���ؼ� ���ʽ� ����Ʈ�� �����ϴ� �޼ҵ�
		bonusPoint += price * bonusRatio;	// ������ ���ʽ� ����Ʈ���� ���ο� ���ʽ� ����Ʈ�� ����
		return price ;				//�Ϲݰ�(Silver) : ���� ������ ����. 
	}
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + 
				bonusPoint + "�Դϴ�. ";
	}
	 /*  customerID, customerName, customerGrade ��  getter, setter */
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
