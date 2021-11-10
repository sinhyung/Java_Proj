package basic_class_11.object;

public class Book1 {
	int bookNumber;			// �⺻ ������ Ÿ�� 
	String bookTitle;		// Wraper Class : ��ü�� ������ Ÿ��
	
	
	Book1 () {} 	// �⺻ ������ , [ bookNumber <== 0, bookTitle <== Null ]
	Book1 ( int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override 		// toString() ��ü��ü�� ��� �Ҷ� �۵��Ǵ� �޼ҵ� 
	public String toString () {
		return bookNumber + "." + bookTitle;		// ��ü�� �ּҸ� ����ϴ� ���� �ƴ϶� 
	}												// ��ü�� ������ ������ ��� 
	
	public static void main(String[] args) {
		Book1 book = new Book1( 200, "����");
		
		System.out.println(book);
		System.out.println(book.toString());
	}

}
