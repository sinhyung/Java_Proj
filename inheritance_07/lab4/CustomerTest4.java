package inheritance_07.lab4;

public class CustomerTest4 {	// ��ĳ����: �θ�Ŭ������ �ʵ�� �޼ҵ常 ����,  
								// ��, �������̵��� �޼ҵ带 ȣ���� ���, �������ε��� ���ؼ� �ڽ��� �޼ҵ尡 ȣ��
	public static void main(String[] args) {
		Customer vc = new VIPCustomer (10030, "ȫ�浿", 2000);	//��ĳ����
		vc.bonusPoint = 1000;
		
		
		System.out.println(vc.getCustomerName() + " ���� �����ؾ��� �ݾ���" + 
				vc.calcPrice(10000));
				
	}

}
