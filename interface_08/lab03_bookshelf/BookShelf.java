package interface_08.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);			// ArrayList [shelf] : �� å�� �߰� 
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);			// å�忡�� å�� ������. 
	}

	@Override
	public int getSize() {			//å���� å�� ���� 
		return getCount();			//shelf Ŭ���� ���ǵ� �޼ҵ� (shelf.size() : ArrayList ���� ����)
	}

}
