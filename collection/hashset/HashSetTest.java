package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {	
	/*
		Set : 1. ������� ������� �ʴ´�. ( index ���ȣ�� ����.)
				 ������� ��� ���� �ʴ´�. 
			  2. �ߺ��� ���� ���� �� �� ����. ( ���̵�, �ֹι�ȣ, ���θ����� �ֹ���ȣ)
			  		//Object �� eqals() ������
			  3. ��� �Ҷ�, ���� �Ҷ�, Iterator (��ȸ��)�� �����. 
	*/

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();	//HashSet�� ����, ����
		hashSet.add("������");
		hashSet.add("ȫ�浿");
		hashSet.add("�̼���");		// ������� ������� �ʴ´�. 
		hashSet.add("������");		// �ߺ��� ���� ������� �ʴ´�. 
		hashSet.add("������");
		hashSet.add("������");
		hashSet.add("������");
		
		System.out.println(hashSet);	// toString() �޼ҵ尡 ������ �Ǿ� �ִ�.
		System.out.println("====Iterator�� ����ؼ� ���===========");
		
		Iterator<String> ir = hashSet.iterator();	//Iterator ����
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("=====HashSet ���� ���� ���� =====");
		
		hashSet.remove("������");
		
		Iterator<String> ir2 = hashSet.iterator();	//Iterator ����
		while (ir2.hasNext()) {

			System.out.println(ir2.next() + " " );
		}
				
	}

}
