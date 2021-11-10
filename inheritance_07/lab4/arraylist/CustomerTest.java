package inheritance_07.lab4.arraylist;
import java.util.ArrayList;
public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer (10030, "ȫ�浿");		//��ĳ����
		Customer customerYul  = new GoldCustomer ( 10040, "������");		//��ĳ����
		Customer customerKim = new VIPCustomer (10050, "������", 12345);	//��ĳ����
		
		customerList.add(customerLee);	 // index 0
		customerList.add(customerShin);  // index 1
		customerList.add(customerHong);  // index 2
		customerList.add(customerYul);   // index 3
		customerList.add(customerKim);   // index 4
		
		System.out.println("=======������ ��� =========");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("========���ʽ� ����Ʈ�� ������ ��� ==========");
		int price = 10000;		
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� ���� �ϼ̽��ϴ�. ");
			System.out.println(customer.getCustomerName() + "���� ���� ����Ʈ�� " + customer.bonusPoint +
					"�Դϴ�. ");				
		}	
		System.out.println("===================");
		Customer c = customerList.get(4);
		System.out.println( c.showCustomerInfo() ); 
	}

}
