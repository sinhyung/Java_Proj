package inheritance_07.lab4.arraylist;

public class GoldCustomer extends Customer {
	double saleRatio;		// ��ǰ ���� ���� ����
	
	public GoldCustomer (int customerID, String customerName) {
		super (customerID, customerName );
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;		// ����Ʈ ���� ���� : 2%
		saleRatio = 0.05;		// ���� ���� ���� : 5% 	
	}
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;		// ������ ���ʽ� ����Ʈ���� (����*���ʽ�����)
		return price - (int) (price * saleRatio);	//5% ���ε� ����
	}
	

}
