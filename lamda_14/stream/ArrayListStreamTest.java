package lamda_14.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {	//�÷����� ��Ʈ�� ���
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");	// index 0
		sList.add("Edward"); // index 1
		sList.add("Jack"); // index 2 
		
		System.out.println("��Ʈ���� ������� �ʰ� ���");
		for ( int i = 0; i < sList.size(); i++) {
			String s = sList.get(i);
			System.out.println(s);
		}
		
		System.out.println("��Ʈ���� ����ؼ� ���");
		Stream <String> stream = sList.stream();	//�÷����� ��Ʈ�� �ν��Ͻ� ����
		//ù��° ��Ʈ��
		stream.forEach(s -> System.out.println(s + " ")); // 
		System.out.println();
		
		
		//�ι�° ��Ʈ��
		System.out.println("�����ؼ� ���");
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
		
		
		//����° ��Ʈ��
		System.out.println("��¥�� ��� : map (��� ���� ����)");
		sList.stream().map(s-> s.length()).forEach(n->System.out.println(n));
		
		//�׹�° ��Ʈ��
		System.out.println("���ڰ� 5�� �̻��� �̸��� ��� : ����(������ ����ؼ� �ɷ����°�");
		sList.stream().filter(s -> s.length() >- 5 ).forEach(s -> System.out.println(s));
		
		System.out.print("ABCDF �� ����Ʈ���� : a.length()");
		String a = "ABCDEF";
		System.out.println(a.length()); // ������ byte ���� ���� 
		
		
	}

}
