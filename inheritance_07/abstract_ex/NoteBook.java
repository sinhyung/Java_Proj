package inheritance_07.abstract_ex;

public abstract class NoteBook extends Computer {  
			// �߻� Ŭ���� : ����Ŭ������ �޼ҵ� �Ϻθ� ������ ���, �߻�Ŭ������ �Ǿ�� �Ѵ�. 
	@Override
	public void display() {
		System.out.println(" ��Ʈ�� ����� ");
	}

	public void noteBookOnly () {
		System.out.println("��Ʈ�Ͽ��� �����ϴ� �޼ҵ� - noteBookOnly");
	}
}
