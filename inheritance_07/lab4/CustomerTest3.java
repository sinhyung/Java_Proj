package inheritance_07.lab4;

public class CustomerTest3 {	//�޼ҵ� �������̵�, �������ε�.

	public static void main(String[] args) {
		Customer customerLee = new Customer( 10010, "�̼���"); //�Ϲ� ��
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345); //VIP ��
		customerKim.bonusPoint = 10000;
		
		int price = 10000; 
		
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ��� �ݾ��� " + 
				customerLee.calcPrice(price));
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ��� �ݾ��� " + 
				customerKim.calcPrice(price));		// �޼ҵ� �������̵�.
					// ���� ���ε� : ��� ���迡�� �θ�Ŭ������ �ڽ�Ŭ�������� ������ �޼ҵ尡 ������ ��� 
					//  	�ڽ� Ŭ������ �޼ҵ�� ���ε��� �ȴ�. 
	}
}
