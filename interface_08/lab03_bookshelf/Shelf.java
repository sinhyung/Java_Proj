package interface_08.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf ; 	//ArrayList ���� , shelf : �ν��Ͻ� ���� 
	
	public Shelf () {		// ������ : �ʱ�ȭ 
		shelf = new ArrayList<String>();		// ArrayList ���� 
	}
	
	
	public ArrayList<String> getShelf(){  // getter : shelf , 
		return shelf;
	}
	public int getCount() {			//
		return shelf.size();  		// ArrayList �� ���� ���� : å���� ���� �ִ� å�� ���� 
	}

}
