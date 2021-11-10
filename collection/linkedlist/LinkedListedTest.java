package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListedTest {	// ����ϰ� ���� �߰�/�����Ҷ� ���ϰ� ���� �ɸ���. 
	
	public static void main(String[] args) {
	
	LinkedList<String> myList = new LinkedList<String>();
	myList.add("A");	//index 0	
	myList.add("B");	//index 1
	myList.add("C");	//index 2 
	
	System.out.println(myList);	//LinkedList�� toString �� ������ �Ǿ� ����.
	System.out.println(" ====index 1�濡 D �� �߰�=====");
	myList.add(1, "D");
	System.out.println(myList);
	System.out.println("======addFirst() �޼ҵ� ���======");
	myList.addFirst("O");	// ù��° �ڸ�(index 0) �� ���߰�
	System.out.println(myList);
	System.out.println("======addLast() �޼ҵ� ���===");
	myList.addLast("K");	// ������ �ڸ��� ���� �߰� 
	System.out.println(myList);
	System.out.println("======remove() �޼ҵ� ���======");
	myList.remove(1);		//index 1�� ����
	System.out.println(myList);
	System.out.println("======removeLast() �޼ҵ� ��� =====");
	myList.removeLast();			// ������ ���� ����
	System.out.println(myList);
	System.out.println("======removeFirst() �޼ҵ� ��� =====");
	myList.removeFirst(); // ó�� ���� ����
	System.out.println(myList);
	
	
}
}
