package inheritance_07.lab4;

public class CustomerTest1 { // �⺻ ������ ȣ��, Setter�� ���ؼ� ���� �ְ� ��� 

	public static void main(String[] args) {
		Customer customerLee = new Customer();	// �θ� ��ü�� ����,  �⺻ ������ ȣ��.( ���:Silver,
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;		
		System.out.println(customerLee.showCustomerInfo());		// �� ���� ��� �޼ҵ� ȣ��,
		
		VIPCustomer customerKim = new VIPCustomer();	// �ڽ� ��ü�� ����
		customerKim.setCustomerID( 10020);		// �θ�Ŭ���� �� �޼ҵ�
		customerKim.setCustomerName ("������");	// �θ�Ŭ���� �� �޼ҵ�
		customerKim.bonusPoint = 1000;			// �θ�Ŭ���� �� �ʵ�
		System.out.println(customerKim.showCustomerInfo()); // �θ�Ŭ���� �� �޼ҵ�

	}

}
