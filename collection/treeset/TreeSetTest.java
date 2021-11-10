package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
		// 1. �����ؼ� ����. (��������)	<== HashSet���� ������.
				//Comparable �������̽��� compareTo()�޼ҵ带 ������ �߱� �����̴�. 
		// 2. �ߺ��� ���� ����
		// 3. index �� ����. (���ȣ�� ����). Iterator�� ���

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();	//TreeSet���� 
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		System.out.println(treeSet);	//toString() ������
		System.out.println("======���� for ������ ���============");
		
		treeSet.add("D");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("G");
		treeSet.add("Z");
		treeSet.add("X");
		
		for (String s : treeSet) {			// ���� For ������ ���
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("======Iterator�� ���=============");
		Iterator<String> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
				

	}

}
