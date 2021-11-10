package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member2;

/*
 * TreeMap : 1. Key-Value ������ ����, Key�� �ߺ��� ���� ���� �� ����. Value�� �ٸ�Ű�� �ߺ��� ���� ������ �ִ�.
 * 			 2. Tree�� �����ؼ� ����, ��� <<Comparable �������̽��� compareTo()�޼ҵ带 ������ ������Ѵ�. 
 * 					compareTo() :������ ����, (��������, ��������) 
 */

public class MemberTreeMap {
	private TreeMap<Integer, Member2> treeMap;	//TreeMap ����
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();	//TreeMap ����
	}
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberid(), member);
	}
	public boolean removeMember(int memberid) {
		if (treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);		// Map���� remove (����) Key�� ����.
			return true;
		}
		System.out.println(memberid + " �� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
		System.out.println("====Iterator�� ����ؼ� ���========");
		Iterator<Integer> ir = treeMap.keySet().iterator(); 
		while(ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key);	//key�� value ���� �����´�(member ��ü)
			System.out.println(member);
		}
		System.out.println("=====���� for ���� ����ؼ� ���=============");
		for (Integer i : treeMap.keySet()) {
			Member2 member = treeMap.get(i);
			System.out.println(member);
		}
			
		
	}

}
