package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	//Stack �ڷ� ������ ���� �Ҵ� : push 
	public void push(String data) {
		arrayStack.add(data);
	}
	//Stack �ڷ� �������� ���� �����´� �� : pop
	public String pop() {
		int len = arrayStack.size(); 	//�� ArrayList�� ����� ���� ����
		if (len ==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len -1));	// ������ ���� ���� ������. 
	}
	public void showAll() {
		for (int i=0 ; i < arrayStack.size(); i++) {
			String a = arrayStack.get(i);
			System.out.println(a + " index : " + i);
			
		}
	
	}
	
}


public class StackTest {	//  ���� �ڷᱸ�� : LIFO (Last In Frist Out) : �������� �� ���� 
							//     ���ϸ��� ��µǴ� �ڷ� ���� , ��) �ٵ��� ������, 
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		// Stack �ڷ����� ���� �Ҵ�. 
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		stack.showAll();
		System.out.println("=================");
		
		System.out.println(stack.pop()); 	//������ ���� ���� ����
		stack.showAll();
		System.out.println("=================");
		
		System.out.println(stack.pop()); 	//������ ���� ���� ����
		stack.showAll();
		System.out.println("=================");
		
		System.out.println(stack.pop()); 	//������ ���� ���� ����
		stack.showAll();
		
		
		
		
		

	}

}
