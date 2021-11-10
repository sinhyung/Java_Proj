package inheritance_07.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer() ;  // ���� : �߻� Ŭ�����̹Ƿ� ��ü ������ �Ұ�
		Computer c2 = new Desktop(); 	// ��ũ��Ʈ Ŭ�����̹Ƿ� ��ü ���� ����
		//Computer c3 = new NoteBook();	//  ���� : �߻�Ŭ���� �̹Ƿ� ��ü ���� �Ұ�
		Computer c4 = new MyNoteBook(); // ��ũ��Ʈ Ŭ���� �̹Ƿ� ��ü ���� ����.
		
		System.out.println("=========DeskTop ��ü ����=============");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		
		System.out.println("=========MyNoteBook ��ü ����=============");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();	
		
		System.out.println("=============������ Ŭ������ �޼ҵ� ȣ��======================");
		Desktop d = (Desktop) c2; 	// �ٿ� ĳ����
		d.desktopOnly();
		NoteBook n = (NoteBook) c4 ; 
		n.noteBookOnly();
		MyNoteBook m = (MyNoteBook)c4;
		m.myNoteBookOnly();
		
		System.out.println(" =============�� Ŭ������ ArrayList�� ������ ���===========");
		ArrayList<Computer> arr = new ArrayList<Computer>();
		
		arr.add(c2);	// index 0
		arr.add(c4);	// index 1
		
		Computer c = arr.get(0);
		c.display();
		c.typing();
		c.turnOn();
		c.turnOff();   
		Desktop dd = (Desktop) c ; 	// �ٿ�ĳ����
		dd.desktopOnly();
		
		Computer cc = arr.get(1);
		cc.display();
		cc.typing();
		cc.turnOn();
		cc.turnOff();
		
		MyNoteBook mm = (MyNoteBook) cc;
		mm.noteBookOnly();		// NoteBook�� �޼ҵ�
		mm.myNoteBookOnly();	// MyNoteBook�� �޼ҵ�
		
		System.out.println("========instanceof �� ����ؼ� �ٿ�ĳ���� ============");
		
		for (int i = 0 ; i < arr.size() ; i++ ) {
			Computer com = arr.get(i);
			if ( com instanceof Desktop ) {
				Desktop de = (Desktop) com ;
				de.desktopOnly();
			}
			if (com instanceof NoteBook ) {
				NoteBook note = (NoteBook) com ;
				note.noteBookOnly();
			}
			if (com instanceof MyNoteBook ) {
				MyNoteBook my = (MyNoteBook) com;
				my.myNoteBookOnly();
			}
		}
		
		
	}

}
