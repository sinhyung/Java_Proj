package basic_class_11.object.clone_ex;

import java.util.ArrayList;

class MyBook implements Cloneable {		// ArrayList ���� 
	String title;
	public MyBook (String title) {
		this.title = title;
	}
	public void setTitle ( String title) {
		this.title = title;
	}
	@Override 
	public String toString() {
		return title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectArrayClone {

	public static void main(String[] args) {
		ArrayList <MyBook> bookList = new ArrayList<MyBook>();		// ArrayList ���� , ����
		MyBook book1 = new MyBook("�ڹ�");
		MyBook book2 = new MyBook("�ȵ���̵�");
		MyBook book3 = new MyBook("���̽�");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();		// ArrayList ���� 
		copyList.add(new MyBook ("C++")); //Copy �� ArrayList C++ �߰�
		
		System.out.println(bookList);
		System.out.println(copyList);
		System.out.println("==============");
		
		book3.setTitle("C���");				// ArrayList���� ��ü ��ü�� �ƴ϶� ��ü�� �ּҰ� ����� 
		System.out.println(bookList);
		System.out.println(copyList);
		
		
	}

}
