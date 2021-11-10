package collection.linkedlist;

import java.util.LinkedList;
import collection.Member;

public class MemberLinkedList {
	private LinkedList<Member> linkedlist;	//����
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	public void addMember(Member member) {	// LinkedList�� member ��ü�� �߰��Ѵ�. <<���������߰�>>	
		linkedlist.add(member);			
	}
	public void addMember2(int a , Member member) { // Ư�� ���ȣ�� ���� �߰�. 
		linkedlist.add(a, member);
	}
	
	public boolean removeMember(int memberid) {//memberid�� ��ǲ �޾Ƽ� linkedList���� �˻��ؼ� ����
		for (int i =0 ; i < linkedlist.size(); i++) {
			Member member = linkedlist.get(i);
			int tempid = member.getMemberid();
			if ( tempid == memberid) {
				linkedlist.remove(i);
				return true;
			}
		}
		System.out.println("���̵� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
		/*
		for (Member member : linkedlist) {
			System.out.println(member);
		}
		*/
		
		for (int i= 0 ; i < linkedlist.size(); i++) {
			Member member = linkedlist.get(i);
			System.out.println(member + " indx ��ȣ�� : " + i);
					
		}
		
		
		System.out.println();
	}

}
