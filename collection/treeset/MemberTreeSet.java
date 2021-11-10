package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member2;

public class MemberTreeSet {
	/*
	 * TreeSet , 1. �����ؼ� ���� , Comparable �������̽��� ���� compareTo() �޼ҵ带 ������ 
	 * 			 2. �ߺ��� �������� ������ ������� �ʽ��ϴ�. 
	 * 			 3. index �� ������ ���� �ʽ��ϴ�. (���ȣ�� ����)
	 */			 
	
	
	private TreeSet<Member2> treeSet;		//TreeSet ���� 
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberid) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempid = member.getMemberid(); //treeSet�� ����� ��ü�� memberid
			if (tempid == memberid) {
				treeSet.remove(member);
				return true;
			}			
		}
		System.out.println("�ش� memberid : " + memberid + "�� ã�� �� �����ϴ�. ");
		return false;					
	}
	
	public void showAllMember() {
		//System.out.println("=====���� For ������ ���===========");
		for (Member2 m : treeSet ) {
			System.out.println(m);
		}
		/*
		System.out.println("========Iterator�� ���=====================");
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		*/
		
	}
	
	
}
