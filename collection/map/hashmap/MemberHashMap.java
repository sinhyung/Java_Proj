package collection.map.hashmap;

import java.util.HashMap;

import java.util.Iterator;

import collection.Member;
/*
 * Map : 1. Key-Value ������ ����
 *		 2. Key ���� �ߺ��� ���� ���� �� ����
 *		   - Value�� �ߺ��� ���� ���� �� �ִ�
 *		 3. �� ��ȣ�� ���� (index ���� �������ʴ´�)
 *		 4. key�� Hash �˰����� ����ؼ� �˻��� ������ ( index = hash(key) ) 
 *				-Hash�˰����� �˻��� ���� ���� �˰����̴�
 *		 5. HashMap - ���� ���� ����
 *		 6. TreeMap - ������ ������ ����, ��� (��������, ��������)
 */

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;	//HashMap : Key, Values
	public MemberHashMap () {	//������
		hashMap = new HashMap<Integer, Member>();	// HashMap ���� 
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member);	//HashMap�� ���� �����Ҷ� Put() �޼ҵ� ���.
	}
	public boolean removeMember(int memberid) {
		
		if (hashMap.containsKey(memberid)) {	//HaspMay���� �˻��Ҷ� key�� ����ؼ� �˻��� 
												//containsKey() Ű ���� �˻�. 
			hashMap.remove(memberid);	//  HashMap������ Key�� �����ϸ� Key-value �� ���� 		
			return true;
		}
		System.out.println("�׷� " + memberid + "�� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
		//Iterator�� ����ؼ� ���
		System.out.println("======Iterator�� ����ؼ� ���======");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);	// get(key) : key�� ���� Value ���� �����´�. 
			System.out.println(member);					
		}
		System.out.println();
		
		//for ���� ����ؼ� ���
		System.out.println("===���� for���� ����ؼ� ���===");
		for(Integer i : hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);
			
		}
		
		
	}
}
