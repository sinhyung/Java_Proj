package inheritance_07.abstract_ex;

public class MyNoteBook extends NoteBook { //��ũ��Ʈ Ŭ���� 

	@Override
	public void typing() {
		System.out.println("���� ��Ʈ�� Ÿ����" );
	}

	public void myNoteBookOnly () {
		System.out.println(" ���̳�Ʈ�Ͽ��� �����ϴ� �޼ҵ� - myNoteBook ");
	}
}
