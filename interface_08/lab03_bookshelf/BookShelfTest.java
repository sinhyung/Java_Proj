package interface_08.lab03_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("�¹��� 1");			//å��(ArrayList)�� å�� �߰�
		shelfQueue.enQueue("�¹��� 2");
		shelfQueue.enQueue("�¹��� 3");
		shelfQueue.enQueue("�¹��� 4");
		shelfQueue.enQueue("�¹��� 5");
		System.out.println( "å���� å�� ���� : " + shelfQueue.getSize());
		System.out.println("================");
		
		
		System.out.println(shelfQueue.deQueue());	// å�忡 å�� ������
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println( "å���� å�� ���� : " + shelfQueue.getSize());
		
	}

}
