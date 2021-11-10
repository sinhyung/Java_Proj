package inheritance_07.lab4.arraylist;

public class VIPCustomer extends Customer {
	private int agentID;	//VIP ���� ��� ����� Ư�� ����,
	double saleRatio;		//��ǰ�� ���η�, VIP�����Ը� ���� 
	
	public VIPCustomer () {
		//super();		// ����[�θ�]Ŭ������ �����ڸ� ȣ��, �����Ϸ��� super(); �ڵ����� �ִ´�.
						// super() �� ���� �Ҷ��� �ݵ�� ù ���ο� �;��Ѵ�. 
		customerGrade = "VIP";	//��ӵ� �ʵ�, ����� : VIP
		bonusRatio = 0.05 ;		//��ӵ� �ʵ�, ���ʽ� ���� ���� : 5%
		saleRatio = 0.1;		// ��ǰ�� ������ ( 10% ���� ) 
	}
	public VIPCustomer( int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// super : �θ�Ŭ������ �����ڸ� ȣ�� 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;	
	}
	@Override
	public int calcPrice (int price) {	// �޼ҵ� �������̵� : ��� ���迡�� ����[�θ�]Ŭ������ �޼ҵ带 ������
		bonusPoint += price * bonusRatio;			// ���ʽ� ����Ʈ ���� 
		return price - (int)(price * saleRatio);	// VIP ���� ��� : ��ǰ ���� ���� (10%)
	}
	public int getAgent () { return agentID ; }		// VIP ���� ����� ��� ID 

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ������ " + agentID + "�Դϴ�." ;
	}
}
