package inheritance_07.lab4;

public class CustomerTest2 {//�Ű������� 3���� ������ ȣ�� 

	public static void main(String[] args) { 
		
		VIPCustomer customerKim = new VIPCustomer (10020, "������", 12345 );
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
	}
}
