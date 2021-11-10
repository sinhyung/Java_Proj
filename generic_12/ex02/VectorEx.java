package generic_12.ex02;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();		// ���ʸ� Ÿ������ Integer ���� 
		 
		v.add(5);	//index 0
		v.add(4);	//index 1
		v.add(-1);	//index 2
		
		v.add(2,100);  // index 2�� 100�� ���� (4�� -1������ ���� 100�� ����)
		
		System.out.println("���ͳ��� ��� ��ü ������ " + v.size());
		System.out.println("������ ���� �뷮" + v.capacity());
		
		//��� ����� ���� ��� �ϱ�
		for ( int i =0 ; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);				
		}
		
		//���ͳ��� ��� ��Ҹ� ���ϱ� 
		int sum = 0;
		for (int i=0 ; i<v.size() ; i++) {
			int n = v.get(i);
			sum += n;				
		}
		System.out.println("������ �ִ� ������ ���� : " + sum);
	}
}
