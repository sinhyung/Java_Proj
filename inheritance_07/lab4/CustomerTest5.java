package inheritance_07.lab4;

public class CustomerTest5 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(100100, "�̼���");
		System.out.println(customerLee.getCustomerName() +  " ���� �����ؾ��� �ݾ��� " + 
				customerLee.calcPrice(price));
			
		
		VIPCustomer customerKim = new VIPCustomer( 10020, "������", 12345);
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ��� �ݾ��� " +
				customerKim.calcPrice(price));
		
		
		Customer vc  = new VIPCustomer (10030, "ȫ�浿", 2000); // ��ĳ����
		System.out.println(vc.getCustomerName() + "���� �����ؾ��� �ݾ���" + 
				vc.calcPrice(price));	
		 //��ĳ���� : �ڽİ�ü�� �����ؼ� �θ� ��ü�� Ÿ������ ������ ��ȯ. <== �θ�ü�� �ʵ峪 �޼ҵ常 ���
					//��. �޼ҵ� �������̵��� ���� ��� �������ε��� ���ؼ� �ڽ� ��ü�� �޼ҵ尡 ȣ���
		
		
	}
}
