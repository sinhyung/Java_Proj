package interface_08.lab03_bookshelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		for ( int i = 0 ; i < 100 ; i++ ) {				// å 100���� å�忡 ����
			shelfQueue.enQueue("�¹��� " +  (i + 1) + "��");
		}

		System.out.println( "å���� å�� ���� : " + shelfQueue.getSize());
		System.out.println("================");
		
		for ( int i= 0 ; i < 30 ; i++ ) {				// å 30���� å�忡�� ������
			System.out.println(shelfQueue.deQueue());
		}
		
		
		System.out.println( "å���� å�� ���� : " + shelfQueue.getSize());

	}

}
