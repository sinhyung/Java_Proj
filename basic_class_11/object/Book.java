package basic_class_11.object;

public class Book {
	int bookNumber;			// �⺻ ������ Ÿ�� 
	String bookTitle;		// Wraper Class : ��ü�� ������ Ÿ��
	
	
	Book () {} 	// �⺻ ������ , [ bookNumber <== 0, bookTitle <== Null ]
	Book ( int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book ( 200, "����");
		
		Object o = book1 ; 	//��ĳ���� 
		
		System.out.println(book1);				// ��ü ��ü�� ����� ��� : Object Class�� toString()
		System.out.println(book1.toString());
			//Object Class�� toStrin() �޼ҵ�� ��ü�� �ּҸ� ������ݴϴ�. 
			// ��ü�� ��ü�̸� ( ��Ű���̸�.Ŭ�����̸�)@�ؽ��ڵ�(�ּ�)

	}

}
