package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; 	// HashSet ��ü ���� ���� 
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	//������ ȣ��ÿ� ��ü ���� ����
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberid) {	//������ �� ��� memberid�� �ش��ϴ� ���� �˻� 
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()){			// ���� ���� �����ϸ� True
			Member member = ir.next(); 	// ��ü�� ������ �ͼ� member ������ ����
			int tempid = member.getMemberid();	// 
			if (tempid == memberid) {
				hashSet.remove(member);		//���ȣ�� ���� �ϴ°��� �ƴ϶� ��ü�̸����� ����
				return true;
			}
		}		
		System.out.println("�ش� ���̵� ���� ���� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {			// Hash Set�� ����� ��� ������ ���
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();		
	}
	

}
