package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList ();
	//ť�� ���� ������ ����ϴ� ��� :  enQueue 
	public void enQueue (String data) {			
		arrayQueue.add(data);		// ť�� ���� �Ҵ�. 
	}
	//ť�� ���� �����Ҷ� ����ϴ� ��� : deQueue
	public String deQueue () {
		int len = arrayQueue.size();
		if (len==0) {
			System.out.println("ť�� ��� �ֽ��ϴ�. ");
			return null;
		}
		return (arrayQueue.remove(0));		///index:0)�� ���� ����. 
	}
	public void showAll() {
		for( int i=0 ; i < arrayQueue.size(); i ++) {
		String b = arrayQueue.get(i);
		System.out.println(b + " Index " + i);		
	}
	
}
}

public class QueueTest {	//ť: FIFO (First In First Out)  : 
								// ���� �� ���� ���� ������ �ڷᱸ��, ��) �ݼ�Ÿ�� ��ȭ�����

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();	//ť�� �ڷ� ����. 
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		
		queue.showAll();
		System.out.println("================");
		
		queue.deQueue();
		queue.showAll();
		
		System.out.println("================");
		
		queue.deQueue();
		queue.showAll();
		
		
		
		
		
		
		
		
	}

}
