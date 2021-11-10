package generic_12.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx { //�ؽ����� �̿��ؼ� �л��̸��� �ڹ� ������ ����ϴ� ���α׷�

	public static void main(String[] args) {
		HashMap <String, Integer> javaScore = new HashMap<String,Integer>();
		
		//5���� ������ HashMap�� ����
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ����� ��� ���� : " + javaScore.size());
		
		//��� ����� �̸��� ������ ��� 
		Set<String> keys = javaScore.keySet();
		
		// key ���ڿ��� ����� �����ϴ� Iterator ���� 
		Iterator<String> it = keys.iterator();		// Set���� ��ȯ�ϸ鼭 ��� 
		
		while ( it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " " + score);
		}
			
	}

}
